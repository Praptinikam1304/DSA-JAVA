
public class Largest3 {

    public static void main(String[] args) {
        int a = 20;
        int b = 50;
        int c = 30;

        if (a > b && a > c) {
            System.out.println("The largest number is: " + a);
        } else if (b > c) {
            System.out.println("The largest number is: " + b);
        } else {
            System.out.println("The largest number is: " + c);
        }
    }
}
