package project.pwr.terrain.positionChange;

import java.util.Random;

public abstract class RandomCoordinatesGenerator {

    public static int spawnChance(int width){
        Random random = new Random();
        return random.nextInt(width);

    }
}
