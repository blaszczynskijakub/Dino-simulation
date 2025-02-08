package project.pwr.terrain.positionChange;

import project.pwr.dino.type.DinoType;
import java.util.*;

public  class DinoLocationShuffle {

    private Random random = new Random();
    public  DinoType[][] dinoTypes;
    private Integer size;
    private  String[][] mapOfLandform;

    public DinoLocationShuffle(DinoType[][] dinoType, Integer size, String[][] mapOfLandform)
    {
        this.dinoTypes = dinoType;
        this.size = size;
        this.mapOfLandform = mapOfLandform;
    }
    public  void shuffleDinoType() {
        for (int i = dinoTypes.length - 1; i > 0; i--)
        {
            for (int j = dinoTypes[i].length - 1; j > 0; j--)
            {
                int m = random.nextInt(i + 1);
                int n = random.nextInt(j + 1);

                DinoType temp = dinoTypes[i][j];
                dinoTypes[i][j] = dinoTypes[m][n];
                dinoTypes[m][n] = temp;
            }
        }
    }
}
