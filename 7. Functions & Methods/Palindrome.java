
public class Palindrome {

    public static boolean isPalindrome(int num) {
        boolean isPalindrome = true;
        int originalNum = num;
        int reverse = 0;
        int lastdigit = 0;
        while (num > 0) {
            lastdigit = num % 10;
            reverse = (reverse * 10) + lastdigit;
            num = num / 10;
            if (originalNum == reverse) {
                isPalindrome = true;
            } else {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        boolean result = isPalindrome(12321);
        System.out.print(result);
    }
}
