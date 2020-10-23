package ru.netology.domein;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class Radiomanx {
    private int maxstation;
    private int maxsound;
    private int currentNumberstation;
    private int currentSound;


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



