package week1;
import java.util.Scanner;

// Write the algorithm of the program that calculates the average of two entered numbers and prints the result on the screen.
// Step 1: Start
// Step 2: Enter the first number (number1)
// Step 3: Enter second number (number2)
// Step 4: Calculate the sum of number1 and number2 and assign to variable. (total = a + b)
// Step 5: divide the total variable by 2 and average the result assign to variable (average = total / 2)
// Step 6: write the average variable to the screen.
// Step 7: Finish
public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter the first number (number1): ");
        double number1 =  scanner.nextDouble();
        System.out.println("Please enter the second number (number2): ");
        double number2 = scanner.nextDouble();

        double total = number1 + number2;
        double average = total / 2;

        System.out.println("The average of " + number1 + " and "+ number2 + " is " + average);
    }
}
