package project.pwr.dino.generator;

import project.pwr.dino.type.DinoType;
import java.util.ArrayList;

public  class DinoGenerate {
    public ArrayList<DinoType> generateDinoType(int numberOfDinos, String dinoType, Integer hp, Integer attack)
    {
        ArrayList<DinoType> generatedDinoType = new ArrayList<>();

        for(int i = 0; i < numberOfDinos; i++)
        {
            generatedDinoType.add(new DinoType(dinoType + Integer.toString(i), hp, attack));
        }
     return generatedDinoType;
    }
}
