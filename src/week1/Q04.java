package week1;
import java.util.Scanner;
// Write the algorithm of the program that finds whether an entered number is positive or negative and prints the result on the screen.
// Step 1: Start
// Step 2: enter number (number)
// Step 3: If number = 0, go back to Step2.
// Step 4: If the number is < 0, write "the entered number is negative" and Go to Step 6.
// Step 5: If the number is > 0, write "the entered number is positive" on the screen.
// Step 6: finish.

public class Q04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        double number = scanner.nextDouble();
        scanner.close();

        if (number == 0){
            System.out.println("Please enter non-zero numbers.");
            return;
        }
        if (number > 0) {
            System.out.println("The entered number is positive.");
        }else if (number < 0){
            System.out.println("The entered number is negative");
        }
    }
}