package week4;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class homeworkWritten_2 {
    public static void main(String[] args) {
        try(FileWriter fileWriter = new FileWriter("TenNumber.txt");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            Scanner scanner = new Scanner(System.in)){
            int[] numbers  = new int[10];
            for(int i = 0 ; i < 10 ; i++){
                System.out.println("Please enter 10 numbers: " + i );
                numbers[i]= scanner.nextInt();
                printWriter.println(numbers[i]);
            }

        } catch (Exception e) {
            System.out.println("An error occurred: " + e);
        }
    }
}
