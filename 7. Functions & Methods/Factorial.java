
import java.util.*;

public class Factorial {

    public static int factorial(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int num = sc.nextInt();
        int fact = factorial(num);
        System.out.println("The factorial of " + num + " is: " + fact);
        System.out.println("The factorial of 8 is: " + factorial(8));
    }
}
