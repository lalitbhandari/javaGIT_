import java.util.Scanner;

/**
 * Write a description of class grade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class grade
{
   


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your grade:\t"); // Using tab escape sequence
        int grade = sc.nextInt();

        String result = (grade >= 40) ? "Pass" : "Fail";

        System.out.println("\nResult:\n\t" + result); // Newline + tab formatting

        
    
}
}