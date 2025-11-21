import java.util.Scanner;

/**
 * Write a description of class RickshawFare here.
 *
 * @author Lalit Bhnadri
 * @version 11/21/2025
 */
public class RickshawFare
{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        
        
        System.out.println("Enter Distance should be in Kilometer");
        double Distance=sc.nextDouble();
        
        System.out.println("Enter time in minutes");
        double time=sc.nextDouble();
        
        System.out.println("IS the customer local (yes/no)");
        String islocalinput = sc.next();
        boolean isLocal = islocalinput.equalsIgnoreCase("yes");

        // Ask if it is night travel
        System.out.print("Is it night time? (yes/no): ");
        String isNightInput = sc.next();
        boolean isNight = isNightInput.equalsIgnoreCase("yes");

        // Base fare calculation
        double fare = (Distance * 25) + (time * 2);   // example formula

        // Apply local discount (ternary operator)
        fare = isLocal ? (fare * 0.9) : fare;   // 10% discount for locals

        // Apply night charge (ternary operator)
        fare = isNight ? (fare * 1.2) : fare;   // 20% extra at night

        // Display final fare in Nepali format
        System.out.println("Total Fare: Rs. " + (int)fare);
    
        
        
        
    }
}