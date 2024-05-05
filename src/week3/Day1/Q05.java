package week3.Day1;
import java.util.Scanner;

// ilk değer küçük hep iki değer al metoda yolla
// iki değer arasındaki sayılar toplamını yazdırsın.
public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Please enter second number: ");
        int number2 = scanner.nextInt();
        int result = sum(number1, number2);
    }
    public static int sum( int number1 , int number2 ){
        int sum = 0;

        for (int i = number1 ; i <= number2 ; i++ ){
            sum = sum + i;
        }

        return sum;
    }
}
