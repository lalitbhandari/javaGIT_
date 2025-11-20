
/**
 * Write a description of class scanner_Input here.
 *
 * @author Lalit bhnadari
 * @version 11/12/2025
 */
import java.util.Scanner; // Import Scanner class

public class Calculator {
    public static void main(String[] args) {
        // Create Scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Ask user for first number
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble(); // Use double to store decimal numbers

        // Ask user for second number
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Display the numbers with proper labels
        System.out.println("--------------------------------");
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        System.out.println("--------------------------------");

        sc.close(); // Close the scanner
    }
}
