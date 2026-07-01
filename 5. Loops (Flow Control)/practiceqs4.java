// This program takes a number as input from the user and prints its multiplication table from 1 to 10.
import java.util.*;

public class practiceqs4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int multiplication = 0;
        for (int i = 1; i <= 10; i++) {
            multiplication = num * i;
            System.out.println(num + " * " + i + " = " + multiplication);
        }
    }
}
