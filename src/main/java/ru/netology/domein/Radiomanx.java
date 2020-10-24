package ru.netology.domein;


public class Radiomanx {
    private int maxstation;
    private int maxsound;
    private int currentNumberstation;
    private int currentSound;

    public Radiomanx() {
    }

    public Radiomanx(int maxstation, int maxsound, int currentNumberstation, int currentSound) {
        this.maxstation = maxstation;
        this.maxsound = maxsound;
        this.currentNumberstation = currentNumberstation;
        this.currentSound = currentSound;
    }

    public int getMaxStation() {
        return maxstation;
    }

    public void setMaxStation(int maxStation) {
        this.maxstation = maxStation;
    }

    public int getMaxSound() {
        return maxsound;
    }

    public void setMaxSound(int maxSound) {
        this.maxsound = maxSound;
    }

    public int getCurrentNumberstation() {
        return currentNumberstation;
    }

    public void setCurrentNumberstation(int currentNumberstation) {
        this.currentNumberstation = currentNumberstation;
    }

    public int getCurrentSound() {
        return currentSound;
    }

    public void setCurrentSound(int currentSound) {
        this.currentSound = currentSound;
    }

    public void increaseCurrentNumberstation() {
        if (currentNumberstation == maxstation) {

            this.currentNumberstation = 0;
            return;
        }
        this.currentNumberstation++;
    }

    public void decreaseCurrentNumberstation() {
        if (currentNumberstation <= 0) {
            this.currentNumberstation = maxstation;
            return;
        }
        this.currentNumberstation--;
    }

    public void increaseCurrentSound() {
        if (currentSound >= maxsound) {

            this.currentSound = maxsound;
            return;
        }
        this.currentSound++;
    }

    public void decreaseCurrentSound() {
        if (currentSound == 0) {

            this.currentSound = 0;
            return;
        }
        this.currentSound --;

    }
        }






