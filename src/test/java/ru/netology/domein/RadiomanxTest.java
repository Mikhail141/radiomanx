package ru.netology.domein;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanxTest {
    Radiomanx radiomanx = new Radiomanx();

    @Test
    void getNumberstation() {
        int maxstation = 10;
        int minstation = 0;

        radiomanx.setCurrentNumberstation(3);
        assertEquals(3, radiomanx.getCurrentNumberstation());

    }

    @Test
    void getSound() {

        int maxsound = 100;
        int maxsound = 10;
        int minsound = 0;

        radiomanx.setCurrentSound(33);
        assertEquals(33, radiomanx.getCurrentSound());
    }


    @Test
    void increaseCurrentNumberstation() {

        radiomanx.setCurrentNumberstation(10);
        radiomanx.increaseCurrentNumberstation();
        assertEquals(0, radiomanx.getCurrentNumberstation());
    void increaseCurrentNumberstationMax() {
        radiomanx.setCurrentNumberstation(9);
        radiomanx.increaseCurrentNumberstation();
        assertEquals(0, radiomanx.getCurrentNumberstation());

    }

    @Test
    void increaseCurrentNumberstation(){
        radiomanx.setCurrentNumberstation(0);
        radiomanx.increaseCurrentNumberstation();
        assertEquals(1, radiomanx.getCurrentNumberstation());

    }

    @Test
    void decreaseCurrentNumberstation() {

        radiomanx.setCurrentNumberstation(0);
        radiomanx.decreaseCurrentNumberstation();
        assertEquals(10, radiomanx.getCurrentNumberstation());
        assertEquals(1,radiomanx.getCurrentNumberstation());
    }

    @Test
    void decreaseCurrentNumberstationMin() {
        radiomanx.setCurrentNumberstation(0);
        radiomanx.decreaseCurrentNumberstation();
        assertEquals(9,radiomanx.getCurrentNumberstation());
    }

    @Test
    void decreaseCurrentNumberstation(){
        radiomanx.setCurrentNumberstation(8);
        radiomanx.decreaseCurrentNumberstation();
        assertEquals(7, radiomanx.getCurrentNumberstation());
    }

    @Test

    void increaseCurrentSound() {

        radiomanx.setCurrentSound(100);
        radiomanx.increaseCurrentSound();
        assertEquals(100, radiomanx.getCurrentSound());
      
    void increaseCurrentSoundMax() {
        radiomanx.setCurrentSound(10);
        radiomanx.increaseCurrentSound();
        assertEquals(10,radiomanx.getCurrentSound());
    }


    @Test
    void increaseCurrentSound(){
        radiomanx.setCurrentSound(7);
        radiomanx.increaseCurrentSound();
        assertEquals(8, radiomanx.getCurrentSound());
    }


    @Test
    void decreaseCurrentSound() {

        radiomanx.setCurrentSound(0);
        radiomanx.decreaseCurrentSound();
        assertEquals(0, radiomanx.getCurrentSound());


    @Test
    void decreaseCurrentSoundMin() {
        radiomanx.setCurrentSound(0);
        radiomanx.decreaseCurrentSound();
        assertEquals(0, radiomanx.getCurrentSound());

    }


    @Test
    void decreaseCurrentSound(){
        radiomanx.setCurrentSound(8);
        radiomanx.decreaseCurrentSound();
        assertEquals(7, radiomanx.getCurrentSound());
    }


}


