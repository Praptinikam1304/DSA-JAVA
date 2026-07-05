
public class decTobin {

    public static void decTobin(int num) {
        int power = 0;
        int bin = 0;
        int myNum = num;
        while (num > 0) {
            int remainder = num % 2;
            bin = bin + (remainder * (int) Math.pow(10, power));
            power++;
            num = num / 2;
        }
        System.out.print("Binary of " + myNum + " is " + bin);
    }

    public static void main(String[] args) {
        decTobin(13);
    }
}
