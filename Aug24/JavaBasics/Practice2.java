/*Factory Outlet Store is having a sale. The store manager needs a program that allows 
 * a sales clerk to enter the original price of an item and the discount rate. 
 * Write a java program to calculate and display the amount of the discount and the sale price. 
*/
import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double originalPrice = 0, discountRate = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter the original price of the item: RM ");
                originalPrice = Double.parseDouble(scanner.nextLine());
                
                System.out.print("Enter the discount rate (as a percentage): ");
                discountRate = Double.parseDouble(scanner.nextLine());
                
                validInput = true;
            } 
            catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid numbers.");
            }
        }
        
        double discountAmount = originalPrice * (discountRate / 100);
        double salePrice = originalPrice - discountAmount;
        
        System.out.println("Discount Amount: RM " + discountAmount);
        System.out.println("Sale Price: RM " + salePrice);
    }
}

