package week3.Day2;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("This codes will find the factorial of number");
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();

        Q06 q06 = new Q06();
        q06.findFactorial(number);
        System.out.println("Factorial result of the number: ");

    }
}
