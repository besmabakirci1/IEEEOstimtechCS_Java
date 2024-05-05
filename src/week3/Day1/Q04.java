package week3.Day1;
public class Q04 {
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("result = " + result );
    }
    public static int factorial(int number){
        int factorial = 1;
        for (int i = 1; i <= number ; i++){
            factorial = factorial * i ;
        }
        return factorial;
    }
}
