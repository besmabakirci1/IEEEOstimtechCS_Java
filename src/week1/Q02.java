package week1;
import java.util.Scanner;

// Write the algorithm of the program that finds the sum of two entered non-zero numbers and prints the result on the screen.
// Step 1: Get Started
// Step 2: Enter the first number(number1)
// Step 3: if the count is zero, go to Step 2
// Step 4: Enter the second number(number2)
// Step 5: if number2 is zero, return to Step 4
// Step 6: Calculate the sum of number1 and number2 and assign it to the variable total. (total = a + b)
// Step 7: write the sum variable to the screen
// Step 8: Finish
public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the first number (number1): ");
        double number1 =  scanner.nextDouble();
        System.out.println("Please enter the second number (number2): ");
        double number2 = scanner.nextDouble();

        if (number1 == 0 || number2 == 0){
            System.out.println("Please enter non-zero numbers.");
            return;
        }
        double total = number1 + number2 ;
        System.out.println("The sum of " + number1 + " and " + number2 + " is: " + total);
    }
}
