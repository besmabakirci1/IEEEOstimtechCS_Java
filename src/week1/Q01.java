package week1;
import java.util.Scanner;

// Write the algorithm of the program that finds the sum of two entered numbers and prints the result on the screen.
// Step 1: Get Started
// Step 2: Enter the first number(number1)
// Step 3: Enter the second number(number2)
// Step 4: Calculate the sum of the number1 and number2 variables and assign them to the total variable (make sum = number1+number2).
// Step 5: write the total variable to the screen
// Step 6: Finish
public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the first number(number1): ");
        double number1 = scanner.nextDouble();
        System.out.print("Please enter the second number(number2): ");
        double number2 = scanner.nextDouble();

        double sum = number1 + number2;
        System.out.println("The sum is: " + sum);
    }
}
