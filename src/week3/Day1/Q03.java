package week3.Day1;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in);
        System.out.println("Please enter a number.");
        int number = scanner.nextInt();
        oddAndEvenNumbers(number) ;
    }
    public static void oddAndEvenNumbers(int number){
       if (number % 2 == 0){
           System.out.println("odd" + number);
        }else{
           System.out.println("even" + number);
       }
    }
}
