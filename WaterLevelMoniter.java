//import java.util.Scanner;

/**
 * Write a description of class WaterLevelMoniter here.
 *
 * @author Lalit Bhnadari
 * @version 11/12/2025
 */
public class WaterLevelMoniter
{
    public static void main(String[] args){
        
        double waterlevel =1200;
        System.out.println("Current waterlevel"+waterlevel+"L");
        String statusMessage = (waterlevel >= 1000) 
                ? "WARNING: Water level has reached 1000L or more!" 
                : "Status: Normal";

        // Display the status message
        System.out.println(statusMessage);
        
    
    }
}