package project.pwr.reading;

public class QuestionInputDisplay {

    public void mapSizeQuestion(){
        System.out.println("Proszę wybrać wielkość mapy poprzez podanie liczby od 1-3. (Gdzie 1 - mała mapa, 2 - średnia mapa, 3 - ogromna mapa): ");
    }

    public void numberOfGrassQuestion(){
        System.out.println("Proszę wybrać płaskość terenu poprzez podanie liczby od 0-10. (Gdzie 0 - brak, 10 - duża ilość): ");
    }

    public void numberOfHillsQuestion(){
        System.out.println("Proszę wybrać górzystość terenu poprzez podanie liczby od 0-10. (Gdzie 0 - brak, 10 - duża ilość): ");
    }

    public void numberOfWaterQuestion(){
        System.out.println("Proszę wybrać ilość akwenów na terenie poprzez podanie liczby od 0-10. (Gdzie 0 - brak, 10 - duża ilość): ");
    }

    public void numberOfForestsQuestion(){
        System.out.println("Proszę wybrać ilość lasów na terenie poprzez podanie liczby od 0-10. (Gdzie 0 - brak, 10 - duża ilość): ");
    }

    public void numberOfPredatorsQuestion(Integer inputMapSize){
        System.out.println("Proszę wybrać ile ma być drapieżników poprzez podanie liczby (maksymalnie " + (inputMapSize * inputMapSize) / 2 + "): ");
    }

    public void numberOfHerbivoresQuestion(Integer inputMapSize){
        System.out.println("Proszę wybrać ile ma być roślinożernych poprzez podanie liczby (maksymalnie " + (inputMapSize * inputMapSize) / 2 + "): ");
    }

    public void numberOfOmnivoresQuestion(Integer inputMapSize){
        System.out.println("Proszę wybrać ile ma być  wszystkożernych poprzez podanie liczby (maksymalnie " + (inputMapSize * inputMapSize) / 2 + "): ");
    }

    public void numberOfYearsQuestion(){
        System.out.println("Proszę wybrać długość trwania symulacji w latach (maksymalnie 5000): ");
    }







}
