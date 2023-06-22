package murph.systemDesign.DesignSystems.SnakeAndLadder;

import java.util.Random;

public class Dice {
    private int diceCount;
    private int min = 1;
    private int max;

    public Dice(int diceCount, int min, int max) {
        this.diceCount = diceCount;
        this.min = min;
        this.max = max;
    }

    public int rollDice(){
        int diceUsed = 0;
        int rollPoints = 0;
        while(diceUsed!=diceCount){
            rollPoints = rollPoints +  new Random().nextInt(max - min) + min;
            diceUsed++;
        }
        return rollPoints;
    }
}
