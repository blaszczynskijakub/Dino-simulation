package project.pwr.terrain.putOnMap;

import project.pwr.dino.type.DinoType;
import project.pwr.terrain.positionChange.RandomCoordinatesGenerator;

import java.util.ArrayList;
import java.util.Arrays;

public class DinoPutOnMap {

    private static int size = 100;

    public static DinoType[][] mapDinoTypePutter(Integer numberOfDinos, ArrayList<DinoType> generatedDinoType, String[][] mapOfLandform, Integer size) {

        DinoType[][] mapOfDinoType = new DinoType[size][size];
        Integer[][] takenPlaces = new Integer[size][size];

        for(int i = 0;i < size; i++)
        {
            for(int q = 0; q < size; q++)
            {
                mapOfDinoType[i][q] = new DinoType("dead",0,0);
            }
        }
        for (Integer[] row: takenPlaces)
            Arrays.fill(row, 2);
        int x;
        int y;

        for (int i = 0; i < numberOfDinos; i++) {
            x = RandomCoordinatesGenerator.spawnChance(size);
            y = RandomCoordinatesGenerator.spawnChance(size);
            while (mapOfLandform[x][y].equals("⛰")|| takenPlaces[x][y] == 1) {
                x = RandomCoordinatesGenerator.spawnChance(size);
                y = RandomCoordinatesGenerator.spawnChance(size);

            }
            mapOfDinoType[x][y] = generatedDinoType.get(i);
            takenPlaces[x][y]=1;

        }
        return mapOfDinoType;
    }
}
