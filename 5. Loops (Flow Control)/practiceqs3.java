// Factorial of a number using for loop
import java.util.*;

public class practiceqs3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
