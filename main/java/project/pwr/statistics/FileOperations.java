package project.pwr.statistics;

public interface FileOperations {
    public String getFilepath();

    public void saveStatsCSV(Integer getPredatorNumber, Integer getHerbivorousNumber, Integer getOmnivorousNumber, String year);

    public void deleteStatsCSV(String filepath);
    
}
