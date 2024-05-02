package week2;
import java.util.Scanner;

// Write a java code that finds whether the number received from the user is odd or even and prints it to the screen.
public class Q01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0){
            System.out.println("The number that you entered " + number + " is even number." );
        }else {
            System.out.println("The number that you entered" + number + " is odd number." );
        }
    }
}
