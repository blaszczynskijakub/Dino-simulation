package project.pwr.terrain.mapOfLandform;

import java.util.ArrayList;
import java.util.Random;

public class MapOfLandform {

    public static String[][] spawnLandform (int width, int height, int grass, int forest, int water, int hills, int limit){
        Random random = new Random();
        int hillCount=0;
        ArrayList<String> los = new ArrayList<>();
        String[][] Landform = new String[width][height];
        for (int i=0;i<grass;i++)
        {
            los.add("෴");
        }
        for (int i=0;i<forest;i++)
        {
            los.add("⍋");
        }
        for (int i=0;i<hills;i++)
        {
            los.add("⛰");
        }
        for (int i=0;i<water;i++)
        {
            los.add("○");
        }


        for(int i = 0; i < width; i += 1) {
            for (int j = 0; j < height; j += 1) {
                Landform[i][j] = los.get(random.nextInt(0, los.size()));
            if (Landform[i][j].equals("⛰")) {
                    hillCount++;
                }
                if (hillCount >= ((width * height) - limit-2)) {
                    for (int k = 0; k< los.size();k++)
                    {
                        if (los.get(k).equals("⛰")) {
                            los.remove(k);
                        }
                    }
                }

            }
        }

        return Landform;
    }
}
