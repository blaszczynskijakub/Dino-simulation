package project.pwr.statistics;

import java.util.ArrayList;
import java.util.List;

public class Statistics {
    private List<Integer> predatorNumber = new ArrayList<>();
    private List<Integer> herbNumber = new ArrayList<>();
    private List<Integer> omniNumber = new ArrayList<>();

    public Integer getPredatorNumber(int year) {
        return predatorNumber.get(year);
    }

    public void setPredatorNumber(int predatorNumberInYear) {
        predatorNumber.add(predatorNumberInYear);
    }

    public Integer getHerbNumber(int year) {
        return herbNumber.get(year);
    }

    public void setHerbNumber(int herbNumberInYear) {
        herbNumber.add(herbNumberInYear);
    }

    public Integer getOmniNumber(int year) {
        return omniNumber.get(year);
    }

    public void setOmniNumber(int omniNumberInYear) {
        omniNumber.add(omniNumberInYear);
    }


}
