package project.pwr;


import project.pwr.dino.generator.DinoGenerate;
import project.pwr.dino.type.*;
import project.pwr.reading.InputReader;
import project.pwr.terrain.mapOfLandform.MostCommonDino;
import project.pwr.terrain.mapOfLandform.ShowGeneratedMap;
import project.pwr.terrain.putOnMap.DinoPutOnMap;
import project.pwr.terrain.mapOfLandform.MapOfLandform;
import project.pwr.terrain.simulationLoop.Simulation;

import java.util.ArrayList;

public class Main
{
    public static void main(String args[])
    {

        InputReader inputReader = new InputReader(); //wczytywanie danych przez uzytkownika
        inputReader.read();

        DinoGenerate dinoGenerate= new DinoGenerate();

        ArrayList<DinoType> predatorList = dinoGenerate.generateDinoType(inputReader.getInputNumberOfPredators(), "Predator",400,95);
        ArrayList<DinoType> herbivorousList = dinoGenerate.generateDinoType(inputReader.getInputNumberOfHerbivores(), "Herbivorous",1000,23);
        ArrayList<DinoType> omnivorousList = dinoGenerate.generateDinoType(inputReader.getInputNumberOfOmnivores(), "Omnivorous",500,50);


        String[][] mapOfLandform = MapOfLandform.spawnLandform(inputReader.getInputMapSize(), inputReader.getInputMapSize(), inputReader.getInputNumberOfGrass(), inputReader.getInputNumberOfForests(), inputReader.getInputNumberOfWater(), inputReader.getInputNumberOfHills(), MostCommonDino.maximumDinoValue(inputReader.getInputNumberOfPredators(), inputReader.getInputNumberOfHerbivores(), inputReader.getInputNumberOfOmnivores()));  //Tworzenie terenu

        DinoType[][] mapOfPredator = DinoPutOnMap.mapDinoTypePutter(inputReader.getInputNumberOfPredators(), predatorList,mapOfLandform, inputReader.getInputMapSize());
        DinoType[][] mapOfHerbivorous = DinoPutOnMap.mapDinoTypePutter(inputReader.getInputNumberOfHerbivores(), herbivorousList,mapOfLandform, inputReader.getInputMapSize());
        DinoType[][] mapOfOmnivorous = DinoPutOnMap.mapDinoTypePutter(inputReader.getInputNumberOfOmnivores(), omnivorousList,mapOfLandform, inputReader.getInputMapSize());


        Simulation simulation = new Simulation(mapOfPredator, mapOfHerbivorous, mapOfOmnivorous, mapOfLandform, inputReader.getInputNumberOfYears(), inputReader.getInputMapSize());
        simulation.startSimulation();

        ShowGeneratedMap map = new ShowGeneratedMap(mapOfLandform, inputReader.getInputMapSize());         //pokaż wygenerowaną mape
        map.showGeneratedMap();

        }
}
