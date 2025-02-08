package project.pwr.reading;

import static project.pwr.reading.UserInputData.scanInteger;

public class InputReader {
    private int inputMapSize;
    private int inputNumberOfGrass;
    private int inputNumberOfHills;
    private int inputNumberOfWater;
    private int inputNumberOfForests;
    private int inputNumberOfPredators;
    private int inputNumberOfHerbivores;
    private int inputNumberOfOmnivores;
    private int inputNumberOfYears;

    public int getInputMapSize() {
        return inputMapSize;
    }

    public void setInputMapSize(int inputMapSize) {
        this.inputMapSize = inputMapSize;
    }

    public int getInputNumberOfGrass() {
        return inputNumberOfGrass;
    }

    public void setInputNumberOfGrass(int inputNumberOfGrass) {
        this.inputNumberOfGrass = inputNumberOfGrass;
    }

    public int getInputNumberOfHills() {
        return inputNumberOfHills;
    }

    public void setInputNumberOfHills(int inputNumberOfHills) {
        this.inputNumberOfHills = inputNumberOfHills;
    }

    public int getInputNumberOfWater() {
        return inputNumberOfWater;
    }

    public void setInputNumberOfWater(int inputNumberOfWater) {
        this.inputNumberOfWater = inputNumberOfWater;
    }

    public int getInputNumberOfForests() {
        return inputNumberOfForests;
    }

    public void setInputNumberOfForests(int inputNumberOfForests) {
        this.inputNumberOfForests = inputNumberOfForests;
    }

    public int getInputNumberOfPredators() {
        return inputNumberOfPredators;
    }

    public void setInputNumberOfPredators(int inputNumberOfPredators) {
        this.inputNumberOfPredators = inputNumberOfPredators;
    }

    public int getInputNumberOfHerbivores() {
        return inputNumberOfHerbivores;
    }

    public void setInputNumberOfHerbivores(int inputNumberOfHerbivores) {
        this.inputNumberOfHerbivores = inputNumberOfHerbivores;
    }

    public int getInputNumberOfOmnivores() {
        return inputNumberOfOmnivores;
    }

    public void setInputNumberOfOmnivores(int inputNumberOfOmnivores) {
        this.inputNumberOfOmnivores = inputNumberOfOmnivores;
    }

    public int getInputNumberOfYears() {
        return inputNumberOfYears;
    }

    public void setInputNumberOfYears(int inputNumberOfYears) {
        this.inputNumberOfYears = inputNumberOfYears;
    }

    QuestionInputDisplay questionInputDisplay = new QuestionInputDisplay();
    public void read() {
        questionInputDisplay.mapSizeQuestion();
        this.inputMapSize = scanInteger() * 100;

        questionInputDisplay.numberOfGrassQuestion();
        this.inputNumberOfGrass = scanInteger();

        questionInputDisplay.numberOfHillsQuestion();
        this.inputNumberOfHills = scanInteger();

        questionInputDisplay.numberOfWaterQuestion();
        this.inputNumberOfWater = scanInteger();

        questionInputDisplay.numberOfForestsQuestion();
        this.inputNumberOfForests = scanInteger();

        questionInputDisplay.numberOfPredatorsQuestion(inputMapSize);
        this.inputNumberOfPredators = scanInteger();

        questionInputDisplay.numberOfHerbivoresQuestion(inputMapSize);
        this.inputNumberOfHerbivores = scanInteger();

        questionInputDisplay.numberOfOmnivoresQuestion(inputMapSize);
        this.inputNumberOfOmnivores = scanInteger();

        questionInputDisplay.numberOfYearsQuestion();
        this.inputNumberOfYears = scanInteger();
    }
}
