package ru.netology.domein;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadiomanxTest {
    Radiomanx radiomanx = new Radiomanx();

    @Test
    void getNumberstation() {
        Radiomanx radioman = new Radiomanx();
        int maxstation = 9;
        int minstation = 0;

        radioman.setCurrentNumberstation(3);
        assertEquals(3,radioman.getCurrentNumberstation());

    }

    @Test
    void getSound() {


        int maxsound = 10;
        int minsound = 0;

        radiomanx.setCurrentSound(10);
        assertEquals(10,radiomanx.getCurrentSound());
    }


    @Test
    void increaseCurrentNumberstation() {


        radiomanx.setCurrentNumberstation(9);
        radiomanx.increaseCurrentNumberstation();
        assertEquals(0,radiomanx.getCurrentNumberstation());

        radiomanx.setCurrentNumberstation(0);
        radiomanx.increaseCurrentNumberstation();
        assertEquals(1,radiomanx.getCurrentNumberstation());

    }

    @Test
    void decreaseCurrentNumberstation() {


        radiomanx.setCurrentNumberstation(0);
        radiomanx.decreaseCurrentNumberstation();
        assertEquals(9,radiomanx.getCurrentNumberstation());

        radiomanx.setCurrentNumberstation(8);
        radiomanx.decreaseCurrentNumberstation();
        assertEquals(7,radiomanx.getCurrentNumberstation());
    }

    @Test
    void increaseCurrentSound() {


        radiomanx.setCurrentSound(10);
        radiomanx.increaseCurrentSound();
        assertEquals(10,radiomanx.getCurrentSound());

        radiomanx.setCurrentSound(7);
        radiomanx.increaseCurrentSound();
        assertEquals(8,radiomanx.getCurrentSound());
    }

    @Test
    void decreaseCurrentSound() {


        radiomanx.setCurrentSound(0);
        radiomanx.decreaseCurrentSound();
        assertEquals(0,radiomanx.getCurrentSound());

        radiomanx.setCurrentSound(8);
        radiomanx.decreaseCurrentSound();
        assertEquals(7,radiomanx.getCurrentSound());
    }
}

