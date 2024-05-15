package week4;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class homeworkReader_2 {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("numbers.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            int[] numbers = new int[10];
            int[] evenNumbers = new int[10];
            int[] oddNumbers = new int[10];


        }catch (Exception e){
            
        }
    }
}
