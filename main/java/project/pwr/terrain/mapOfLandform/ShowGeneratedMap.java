package project.pwr.terrain.mapOfLandform;

public class ShowGeneratedMap {
    String[][] mapOfLandform;
    int sizeInput;

    public ShowGeneratedMap(String[][] mapOfLandform, Integer sizeInput){
        this.mapOfLandform = mapOfLandform;
        this.sizeInput = sizeInput;
    }
    public void showGeneratedMap() {
        for (int i = 0; i < sizeInput; i++) {
            for (int q = 0; q < sizeInput; q++) {
                System.out.print(mapOfLandform[i][q]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("                ↑ Wygenerowana mapa ↑           ");
    }
}
