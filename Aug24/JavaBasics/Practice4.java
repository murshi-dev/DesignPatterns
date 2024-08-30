/*Mekio appliances needs a program that allows the store clerks to enter the number of dishwashers 
 * in stock at the beginning of the month, the number purchased during the month, and the number sold 
 * during the month. Write a java program to calculate and display the number of dishwashers 
 * in stock at the end of the month.
*/
import java.util.Scanner;
public class Practice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int startStock = 0, purchased = 0, sold = 0;
        boolean validInput1 = false,validInput2 = false,validInput3 = false;

        
        while (!validInput1) {
            try {
                System.out.print("Enter the number of dishwashers in stock at the beginning of the month: ");
                startStock = Integer.parseInt(scanner.nextLine());
                                         
                validInput1 = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter again.");
            }
        }
        
        while (!validInput2) {
            try {
                
                System.out.print("Enter the number of dishwashers purchased during the month: ");
                purchased = Integer.parseInt(scanner.nextLine());
      
                validInput2 = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter again.");
            }
        }
        
        while (!validInput3) {
            try {
                System.out.print("Enter the number of dishwashers sold during the month: ");
                sold = Integer.parseInt(scanner.nextLine());

                
                validInput3 = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter again.");
            }
        }
        int endStock = startStock + purchased - sold;
        
        System.out.println("Dishwashers in stock at the end of the month: " + endStock);


    }
}

