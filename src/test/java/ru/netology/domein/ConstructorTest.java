package ru.netology.domein;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConstructorTest {
    Constructor constructor = new Constructor(12,7,110,55);

    @Test

    void shoudlcheckFields(){
        assertEquals(12,constructor.getMaxNumberstation());
        assertEquals(7,constructor.getCurrentNumberstation());
        assertEquals(110,constructor.getMaxSound());
        assertEquals(55,constructor.getCurrentSound());
    }

    @Test

    void shoudlcheckFieldsDefault(){
        Constructor constructor = new Constructor();
        assertEquals(10,constructor.getMaxNumberstation());
        assertEquals(5,constructor.getCurrentNumberstation());
        assertEquals(100,constructor.getMaxSound());
        assertEquals(50,constructor.getCurrentSound());
    }


    @Test
    void getMaxNumberstation() {
        constructor.setMaxNumberstation(10);
        assertEquals(10,constructor.getMaxNumberstation());
    }

    @Test
    void getMaxSound() {
        constructor.setMaxSound(100);
        assertEquals(100,constructor.getMaxSound());
    }



    @Test
    void getNumberstation() {
        int maxstation = 10;
        int minstation = 0;

        constructor.setCurrentNumberstation(3);
        assertEquals(3, constructor.getCurrentNumberstation());

    }

    @Test
    void getSound() {
        int maxsound = 100;
        int minsound = 0;

        constructor.setCurrentSound(33);
        assertEquals(33, constructor.getCurrentSound());
    }


    @Test
    void increaseCurrentNumberstation() {

        constructor.setCurrentNumberstation(10);
        constructor.increaseCurrentNumberstation();
        assertEquals(0, constructor.getCurrentNumberstation());

        constructor.setCurrentNumberstation(0);
        constructor.increaseCurrentNumberstation();
        assertEquals(1, constructor.getCurrentNumberstation());

    }

    @Test
    void decreaseCurrentNumberstation() {

        constructor.setCurrentNumberstation(0);
        constructor.decreaseCurrentNumberstation();
        assertEquals(10, constructor.getCurrentNumberstation());

        constructor.setCurrentNumberstation(8);
        constructor.decreaseCurrentNumberstation();
        assertEquals(7, constructor.getCurrentNumberstation());
    }

    @Test
    void increaseCurrentSound() {

        constructor.setCurrentSound(100);
        constructor.increaseCurrentSound();
        assertEquals(100, constructor.getCurrentSound());

        constructor.setCurrentSound(7);
        constructor.increaseCurrentSound();
        assertEquals(8, constructor.getCurrentSound());
    }

    @Test
    void decreaseCurrentSound() {

        constructor.setCurrentSound(0);
        constructor.decreaseCurrentSound();
        assertEquals(0, constructor.getCurrentSound());

        constructor.setCurrentSound(8);
        constructor.decreaseCurrentSound();
        assertEquals(7, constructor.getCurrentSound());
    }


}