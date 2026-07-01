// This program takes a number of inputs from the user and calculates the sum of even and odd numbers separately.
import java.util.*;

public class practiceqs2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of inputs: ");
        int n = sc.nextInt();
        int Evensum = 0;
        int Oddsum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number:");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                Evensum += num;
            } else {
                Oddsum += num;
            }
        }
        System.out.println("Sum of even numbers: " + Evensum);
        System.out.println("Sum of odd numbers: " + Oddsum);
    }
}
