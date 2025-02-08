package project.pwr.statistics;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.StandardOpenOption;

public class ManageStatsCSV implements FileOperations{
    private final String filepath = "Result.csv";
    @Override
    public String getFilepath() {
        return filepath;
    }

    @Override
    public void saveStatsCSV(Integer getPredatorNumber, Integer getHerbivorousNumber, Integer getOmnivorousNumber, String year){
        try
        {
            FileWriter fw = new FileWriter(filepath, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println("Po roku " + year + ":               " + getPredatorNumber + "                             " + getHerbivorousNumber + "                                " + getOmnivorousNumber);
            pw.flush();
            pw.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Data not saved");
        }
    }
    @Override

    public void deleteStatsCSV(String filepath){
        try
        {
            FileWriter fw = new FileWriter(filepath, false);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println("                              Drapiezniki" + "                " + "Roslinozerne" + "                " + "Wszystkozerne");
            pw.flush();
            JOptionPane.showMessageDialog(null, "Data saved in " + filepath);
            pw.close();

        }

        catch (IOException e)
        {
            JOptionPane.showMessageDialog(null, "Data not deleted");
        }
    }
}

