
public class Prime {

    public static boolean isPrime(int num) {
        boolean isPrime = true;
        if (num == 2) {
            isPrime = true;
            return isPrime;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        int num = 29;
        System.out.println(isPrime(num));
    }
}
