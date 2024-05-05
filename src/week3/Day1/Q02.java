package week3.Day1;
import java.util.Scanner;
import static java.lang.Integer.sum;

public class Q02 {
    public static void main(String[] args) {
        int number1 = 5 ;
        int number2 = 30;
        product(number1 , number2);
    }

    public static void product(int number1, int number2){
        int product = number1 * number2;
        System.out.println("The multiplication of two numbers is: " + product);
    }
}
