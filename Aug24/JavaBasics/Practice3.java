/*Crispi's Bagels wants a program that allows its salesclerks to enter the number of bagels,
 *  donuts, and cups of coffee a customer orders. Bagels are priced at RM 3 each, donuts RM 4.25 each, and 
 *  coffee is RM 2.30 per cup. Write a java program  to calculate and display the total price of the customer’s order. 
 *  Also calculate the GST (6%) from the total bill. 
*/
import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numBagels = 0, numDonuts = 0, numCoffees = 0;
        boolean validInput1= false,validInput2= false,validInput3= false;
        
        while (!validInput1) {
            try {
                System.out.print("Enter the number of bagels: ");
                numBagels = Integer.parseInt(scanner.nextLine());
                
                              
                validInput1 = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for bagels.");
            }
        }
        
        while (!validInput2) {
            try {
                
                System.out.print("Enter the number of donuts: ");
                numDonuts = Integer.parseInt(scanner.nextLine());
                
                              
                validInput2 = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for donuts.");
            }
        }
        
        while (!validInput3) {
            try {
                
                System.out.print("Enter the number of cups of coffee: ");
                numCoffees = Integer.parseInt(scanner.nextLine());
                
                validInput3 = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number for coffee.");
            }
        }
        double bagelPrice = 3.00;
        double donutPrice = 4.25;
        double coffeePrice = 2.30;

        double totalPrice = (numBagels * bagelPrice) + (numDonuts * donutPrice) + (numCoffees * coffeePrice);
        double gst = totalPrice * 0.06;
        double totalWithGST = totalPrice + gst;

        System.out.println("Total Price: RM " + totalPrice);
        System.out.println("GST (6%): RM " + gst);
        System.out.println("Total with GST: RM " + totalWithGST);

    }
}

