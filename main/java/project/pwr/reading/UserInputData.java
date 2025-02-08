package project.pwr.reading;

import java.util.Scanner;

 public class UserInputData
{
    private static Scanner scan = new Scanner(System.in);

    public static int scanInteger()
    {
        return scan.nextInt();
    }
    
}