package week1;
import java.util.Scanner;

// Algorithm and flowchart that calculates the sum of integers from 1 to N
// Step 1: Start
// Step 2: Enter the number N(N)
// Step 3: assign 0 to the total variable. (total=o)
// Step 4: Assign 0 to the counter variable. (counter=o)
// Step 5: If counter > N-1, go to Step8.
// Step 6: increase the combat value by 1. (counter = counter+1)
// Step 7: add the total variable and the counter variable and get the result
// assign it to the total variable and go to Step5. (total = total+ counter)
// Step 8: write the total variable to the screen.
// Step 9: Finish
public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");
        double N = scanner.nextDouble();
        double total = 0;
        double counter = 0;

        while(counter <= (N - 1)){
            counter ++;
            total += counter;
        }
        System.out.println("The sum of integers from 1 to " + N + " is: " + total);
    }
}

// kafana takılanı sor mesela neden sonsuz döngüye girdi?
// akış şeması ile aynı olduğunu düşünmüyorum yazdığımın.
