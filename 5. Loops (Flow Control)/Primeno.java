
import java.util.*;

public class Primeno {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        if (num == 2) {// 2 is a prime number
            System.out.println(num + " is a prime number.");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= num - 1; i++) { //check for factors from 2 to num-1
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }
}
