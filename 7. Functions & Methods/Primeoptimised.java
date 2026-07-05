
public class Primeoptimised {

    public static boolean Isprime(int num) {
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 29;
        System.out.println(Isprime(num));
    }
}
