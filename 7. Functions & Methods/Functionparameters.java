
import java.util.*;

public class Functionparameters {

    public static int calculatesum(int num1, int num2) {//formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = calculatesum(a, b);//actual parameters
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
    }
}
