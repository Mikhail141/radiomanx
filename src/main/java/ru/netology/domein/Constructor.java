package ru.netology.domein;

public class Constructor {

    private int maxNumberstation = 10;
    private int currentNumberstation = 5;

    private int maxSound = 100;
    private int currentSound = 50;

    public Constructor() {

    }

    public Constructor(int maxNumberstation, int currentNumberstation, int maxSound, int currentSound) {
        this.maxNumberstation = maxNumberstation;
        this.currentNumberstation = currentNumberstation;
        this.maxSound = maxSound;
        this.currentSound = currentSound;
    }

    public int getMaxNumberstation() {

        return maxNumberstation;
    }

    public void setMaxNumberstation(int maxNumberstation) {

        this.maxNumberstation = maxNumberstation;
    }

    public int getCurrentNumberstation() {
        return currentNumberstation;
    }

    public void setCurrentNumberstation(int currentNumberstation) {

        this.currentNumberstation = currentNumberstation;
    }

    public int getMaxSound() {
        return maxSound;
    }

    public void setMaxSound(int maxSound) {
        this.maxSound = maxSound;
    }

    public int getCurrentSound() {
        return currentSound;
    }

    public void setCurrentSound(int currentSound) {
        this.currentSound = currentSound;
    }

    public void increaseCurrentNumberstation() {
        if (currentNumberstation == 10) {

            this.currentNumberstation = 0;
            return;
        }
        this.currentNumberstation++;
    }

    public void decreaseCurrentNumberstation() {
        if (currentNumberstation <= 0) {
            this.currentNumberstation = 10;
            return;
        }
        this.currentNumberstation--;
    }

    public void increaseCurrentSound() {
        if (currentSound >= 100) {
            return;
        }
        this.currentSound++;
    }

    public void decreaseCurrentSound() {
        if (currentSound <= 0) {
            return;
        }
        this.currentSound --;

    }
}
