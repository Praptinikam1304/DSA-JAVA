
public class Reversenum {

    public static void main(String[] args) {
        int n = 81205;
        int rev = 0;
        while (n > 0) {
            int lastdigit = n % 10;//gives last digit
            rev = (rev * 10) + lastdigit;
            n = n / 10;
        }
        System.out.print(rev);
    }
}
