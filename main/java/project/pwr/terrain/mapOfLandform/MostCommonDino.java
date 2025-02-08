package project.pwr.terrain.mapOfLandform;

public abstract class MostCommonDino {

    public static Integer maximumDinoValue(int numberOfPredators, int numberOfHerbivores, int numberOfOmnivores){
        int maximum = numberOfPredators;

        if (numberOfHerbivores > maximum)
            return numberOfHerbivores;

        if (numberOfOmnivores > maximum)
            return numberOfOmnivores;

        return maximum;
    }

}
