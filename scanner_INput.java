import java.util.Scanner;


public class scanner_INput {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt(); 

        // Ask user for second number 
        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        
        System.out.println("First Number: " + num1);
        System.out.println("Second Number: " + num2);
        

        
    }
}
