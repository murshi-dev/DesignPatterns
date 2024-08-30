/*A quantity known as body mass index (BMI) is used to calculate the risk of weight related health problems. 
 * BMI is computed by the formula 
 
Where w is the weight in kilograms and i is the height in centimeters. 
Write a Java program that accepts the weight and height and outputs the BMI.

*/
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double weight = 0, height = 0;

        boolean validInput1 = false,validInput2 = false;

        
        while (!validInput1) {
            try {
                System.out.print("Enter your weight in kilograms: ");
                weight = Double.parseDouble(scanner.nextLine());

                                         
                validInput1 = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter again.");
            }
        }
        
        while (!validInput2) {
            try {
                System.out.print("Enter your height in centimeters: ");
                height = Double.parseDouble(scanner.nextLine());

      
                validInput2 = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter again.");
            }
        }
        

        // Convert height from centimeters to meters for the BMI formula
height = height / 100;

double bmi = weight / (height * height);

System.out.println("Your BMI is: " + bmi);



    }
}

