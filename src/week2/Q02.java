package week2;
import java.util.Scanner;

// Kullanıcıdan alınan sayının faktöriyelini bulan ve ekrana yazdıran java kodu yazınız
// Write a java code that finds the factorial of the number received from the user and prints it on the screen.
public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number that you want to find the factorial of it: ");
        int number = scanner.nextInt();
        int sum=1;
        if (number < 0){
            System.out.println("The negative numbers doesn't has a factorial value. ");
        }

        for(int i = 2 ; i <= number ; ++i){
            sum *= i;
        }
        System.out.println("the factorial is:  " + sum);
    }
}
