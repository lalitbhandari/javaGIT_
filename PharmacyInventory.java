import java.util.Scanner;

/**
 * Write a description of class aausadiPasal here.
 *
 * @author Lalit Bhnadri
 * @version 11/13/2025
 */
import java.util.Scanner;

public class PharmacyInventory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Pharmacy Inventory Management");
            System.out.println("1. Paracetamol");
            System.out.println("2. painkiller");
            System.out.println("3. Dektol");
            System.out.println("4. Cetamol");
            System.out.print("Enter your choice (1-4): ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            if (choice == 1) {
                // Add medicine
                System.out.print(" price of paracetamol is 40 per tablet ");
            } else if (choice == 2) {
                    System.out.println("price of painkiller is 30 per tablet");
                } else if (choice ==3) {
                    System.out.println(" price of dektol is 20 per tablet");
                } else if (choice ==4){
                    System.out.println("Price of cetamol is 45 per tablet");
                } else{
                    System.out.println(" The number not exist");
                }
                }
                   
                   
                                           
    }

