package project.pwr.terrain.simulationLoop;

import project.pwr.dino.type.DinoFight;
import project.pwr.dino.type.DinoType;
import project.pwr.statistics.ManageStatsCSV;
import project.pwr.statistics.Statistics;
import project.pwr.terrain.positionChange.DinoLocationShuffle;

public class Simulation {
    private int yearInput;
    private int sizeInput;

    Statistics statistics = new Statistics();

    private DinoType[][] mapOfPredator;
    private DinoType[][] mapOfHerbivorous;
    private DinoType[][] mapOfOmnivorous;
    private String[][] mapOfLandform;

    private int herbCounter = 0;
    private int predatorCounter = 0;
    private int omniCounter = 0;

    public Simulation(DinoType[][] mapOfPredator, DinoType[][] mapOfHerbivorous, DinoType[][] mapOfOmnivorous, String[][] mapOfLandform, Integer yearInput, Integer sizeInput){
        this.mapOfPredator = mapOfPredator;
        this.mapOfHerbivorous = mapOfHerbivorous;
        this.mapOfOmnivorous = mapOfOmnivorous;
        this.mapOfLandform = mapOfLandform;
        this.yearInput = yearInput;
        this.sizeInput = sizeInput;
    }

    public void startSimulation() {
        System.out.println("Proszę czekać...");
        for (int year = 0; year < yearInput; year++) {
                for (int i = 0; i < sizeInput; i++) {
                    for (int q = 0; q < sizeInput; q++) {
                        if (!mapOfPredator[i][q].id.equals("dead") && !mapOfHerbivorous[i][q].id.equals("dead") && !mapOfOmnivorous[i][q].id.equals("dead")) {

                            DinoFight dinoFight = new DinoFight(mapOfPredator[i][q], mapOfOmnivorous[i][q], mapOfHerbivorous[i][q]);
                            dinoFight.result();

                            mapOfOmnivorous[i][q] = dinoFight.omnivorous;
                            mapOfHerbivorous[i][q] = dinoFight.herbivorous;
                            mapOfPredator[i][q] = dinoFight.predator;

                            if (mapOfHerbivorous[i][q].alive == 0) {

                                mapOfHerbivorous[i][q].id = "dead";

                            }

                            if (mapOfPredator[i][q].alive == 0) {
                                mapOfPredator[i][q].id = "dead";

                            }

                            if (mapOfOmnivorous[i][q].alive == 0) {
                                mapOfOmnivorous[i][q].id = "dead";

                            }
                        } else if (!mapOfPredator[i][q].id.equals("dead") && !mapOfOmnivorous[i][q].id.equals("dead")) {

                            DinoFight dinoFight = new DinoFight(mapOfPredator[i][q], mapOfOmnivorous[i][q], new DinoType("useless", 0, 0));
                            dinoFight.herbivorous.attack = 0;

                            dinoFight.result();

                            mapOfOmnivorous[i][q] = dinoFight.omnivorous;
                            mapOfPredator[i][q] = dinoFight.predator;

                            if (mapOfPredator[i][q].alive == 0) {
                                mapOfPredator[i][q].id = "dead";

                            }


                            if (mapOfOmnivorous[i][q].alive == 0) {
                                mapOfOmnivorous[i][q].id = "dead";

                            }
                        }
//
                        else if (!mapOfHerbivorous[i][q].id.equals("dead") && !mapOfOmnivorous[i][q].id.equals("dead")) {

                            DinoFight dinoFight = new DinoFight(new DinoType("useless", 0, 0), mapOfOmnivorous[i][q], mapOfHerbivorous[i][q]);
                            dinoFight.predator.attack = 0;

                            dinoFight.result();

                            mapOfOmnivorous[i][q] = dinoFight.omnivorous;
                            mapOfHerbivorous[i][q] = dinoFight.herbivorous;

                            if (mapOfHerbivorous[i][q].alive == 0) {
                                mapOfHerbivorous[i][q].id = "dead";
                            }

                            if (mapOfOmnivorous[i][q].alive == 0) {
                                mapOfOmnivorous[i][q].id = "dead";
                            }
                        } else if (!mapOfPredator[i][q].id.equals("dead") && !mapOfHerbivorous[i][q].id.equals("dead")) {

                            DinoFight dinoFight = new DinoFight(mapOfPredator[i][q], new DinoType("useless", 0, 0), mapOfHerbivorous[i][q]);
                            dinoFight.omnivorous.attack = 0;

                            dinoFight.result();

                            mapOfHerbivorous[i][q] = dinoFight.herbivorous;
                            mapOfPredator[i][q] = dinoFight.predator;

                            if (mapOfHerbivorous[i][q].alive == 0) {
                                mapOfHerbivorous[i][q].id = "dead";

                            }

                            if (mapOfPredator[i][q].alive == 0) {
                                mapOfPredator[i][q].id = "dead";

                            }
                        }
                    }
                }


                for (int i = 0; i < sizeInput; i++) {
                    for (int q = 0; q < sizeInput; q++) {
                        if (!mapOfHerbivorous[i][q].id.equals("dead") && !mapOfHerbivorous[i][q].id.equals("useless"))
                            herbCounter++;
                    }
                }
                for (int i = 0; i < sizeInput; i++) {
                    for (int q = 0; q < sizeInput; q++) {
                        if (!mapOfPredator[i][q].id.equals("dead") && !mapOfPredator[i][q].id.equals("useless"))
                            predatorCounter++;
                    }
                }
                for (int i = 0; i < sizeInput; i++) {
                    for (int q = 0; q < sizeInput; q++) {
                        if (!mapOfOmnivorous[i][q].id.equals("dead") && !mapOfOmnivorous[i][q].id.equals("useless"))
                            omniCounter++;
                    }
                }

                statistics.setPredatorNumber(predatorCounter);
                statistics.setOmniNumber(omniCounter);
                statistics.setHerbNumber(herbCounter);

                herbCounter = 0;
                omniCounter = 0;
                predatorCounter = 0;

                DinoLocationShuffle predatorLocationShuffle = new DinoLocationShuffle(mapOfPredator, sizeInput, mapOfLandform);
                predatorLocationShuffle.shuffleDinoType();
                mapOfPredator = predatorLocationShuffle.dinoTypes;

                DinoLocationShuffle herbivorousLocationShuffle = new DinoLocationShuffle(mapOfHerbivorous, sizeInput, mapOfLandform);
                herbivorousLocationShuffle.shuffleDinoType();
                mapOfHerbivorous = herbivorousLocationShuffle.dinoTypes;

                DinoLocationShuffle omnivorousLocationShuffle = new DinoLocationShuffle(mapOfOmnivorous, sizeInput, mapOfLandform);
                omnivorousLocationShuffle.shuffleDinoType();
                mapOfOmnivorous = omnivorousLocationShuffle.dinoTypes;
        }
        ManageStatsCSV manageStatsCSV = new ManageStatsCSV();

        manageStatsCSV.deleteStatsCSV(manageStatsCSV.getFilepath());

        for (int i = 0; i < yearInput; i++)
        {
            manageStatsCSV.saveStatsCSV(statistics.getPredatorNumber(i), statistics.getHerbNumber(i), statistics.getOmniNumber(i), Integer.toString(i));
        }

    }
}
