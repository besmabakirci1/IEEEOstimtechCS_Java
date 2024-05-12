package week4;
import java.io.FileReader;
//      // bir önceki eğer -38 değil ise,
//      2 sayıyı yan yana yaızp topla 10
//      //  System.out.println(y);

public class homeworkReader_1 {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("number.txt")) {
            int i ;
            int sum = 0;
            int previous = 0;
            while ((i = fileReader.read()) != -1) {
                char let = (char) i;
                if (Character.isDigit(let)) {
                    int number = Character.getNumericValue(let);
                    if (previous != -38) {
                        previous ++;
                        sum = (number + previous);
                    }
                    System.out.print("Sum the number with previous: " + number + "+" + previous + "=" + sum + "\n");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
