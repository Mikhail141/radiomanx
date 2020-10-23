package ru.netology.domein;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadiomanxTest {
    Radiomanx radiomanx = new Radiomanx(10,100,0,0);

    @Test
    void getNumberstation() {
        radiomanx.setCurrentNumberstation(5);
        assertEquals(5,radiomanx.getCurrentNumberstation());

    }

    @Test
    void getSound() {
        radiomanx.setCurrentSound(100);
        assertEquals(100,radiomanx.getCurrentSound());
    }


    @Test
    void increaseCurrentNumberstationMax() {
        radiomanx.setCurrentNumberstation(10);
        radiomanx.increaseCurrentNumberstation();
        assertEquals(0, radiomanx.getCurrentNumberstation());

    }


    @Test
    void increaseCurrentNumberstation(){
        radiomanx.setCurrentNumberstation(0);
        radiomanx.increaseCurrentNumberstation();
        assertEquals(1,radiomanx.getCurrentNumberstation());
    }


    @Test
    void decreaseCurrentNumberstationMin() {
        radiomanx.setCurrentNumberstation(0);
        radiomanx.decreaseCurrentNumberstation();
        assertEquals(10,radiomanx.getCurrentNumberstation());

    }


    @Test
    void decreaseCurrentNumberstation(){
        radiomanx.setCurrentNumberstation(8);
        radiomanx.decreaseCurrentNumberstation();
        assertEquals(7,radiomanx.getCurrentNumberstation());
    }


    @Test
    void increaseCurrentSoundMax() {
        radiomanx.setCurrentSound(100);
        radiomanx.increaseCurrentSound();
        assertEquals(100,radiomanx.getCurrentSound());

    }


    @Test
    void increaseCurrentSound(){
        radiomanx.setCurrentSound(7);
        radiomanx.increaseCurrentSound();
        assertEquals(8,radiomanx.getCurrentSound());
    }


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
        assertEquals(7,radiomanx.getCurrentSound());
    }

    @Test
    void getMaxstation() {
        radiomanx.setMaxstation(10);
        assertEquals(10,radiomanx.getMaxstation());
    }

    @Test
    void getMaxsound() {
        radiomanx.setMaxsound(100);
        assertEquals(100,radiomanx.getMaxsound());
    }


}


