
public class avg {

    public static void avgnum(int num1, int num2, int num3) {
        int avg = (num1 + num2 + num3) / 3;
        System.out.print("Average of " + num1 + ", " + num2 + ", " + num3 + " is " + avg);
    }

    public static void main(String[] args) {
        avgnum(10, 20, 30);
    }
}
