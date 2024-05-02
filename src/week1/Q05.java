package week1;
import java.util.Scanner;

// Write the algorithm of the program that finds which of the two entered numbers is smaller and prints the result to the screen.
// Step 1: Start
// Step 2: Enter the first number(number1)
// Step 3: Enter second number(number2)
// Step 4: If number1 == number2, "number and argument are the same."
// Step 5: If number1 > number2, "the number is less." is displayed on the screen.
// Step 6: If the number1 < number2, "number is less" is displayed on the screen.
// Step 7: Finish
public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number(number1): ");
        double number1 = scanner.nextDouble();
        System.out.println("Please enter the second number(number2): ");
        double number2 = scanner.nextDouble();
        if (number1 == number2){
            System.out.println("Number and argument are the same");
        } else if (number1 >number2) {
            System.out.println("The number1" + number1 + "is more than number2" + number2);
        }else {
            System.out.println("The number1" + number1 + "is less than number2" + number2);
        }

    }
}
