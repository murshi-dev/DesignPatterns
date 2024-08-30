/*Write a java program that inputs the year a person is born
and outputs the age of the person in the following format:
You were born in 2000 and will be 24 this year
*/
import java.util.Scanner;
public class Practice1 {

	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        int birthYear = 0;
        int currentYear = 2024;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                System.out.print("Enter the year you were born: ");
                birthYear = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid year.");
            }
        }
        int age = currentYear - birthYear;
        System.out.println("You were born in " + birthYear + " and will be " + age + " this year.");

		
	}

}
