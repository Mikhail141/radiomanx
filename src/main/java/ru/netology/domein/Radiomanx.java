package ru.netology.domein;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radiomanx {
    private int maxstation = 10;
    private int maxsound = 100;
    private int currentNumberstation;
    private int currentSound;


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

            this.currentSound = 100;
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



