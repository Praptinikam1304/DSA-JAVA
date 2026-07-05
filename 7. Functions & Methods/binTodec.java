
public class binTodec {

    public static void binTodec(int num) {
        int myNum = num;
        int dec = 0;
        int pow = 0;
        while (num > 0) {
            int lastdigit = num % 10; //last digit nighayla
            dec = dec + (lastdigit * (int) Math.pow(2, pow));//inbuilt function to calculate power of 2..double value is typecasted to int
            pow++;
            num = num / 10; //number la chota karayla
        }
        System.out.println("Decimal of " + myNum + " is: " + dec);
    }

    public static void main(String[] args) {
        binTodec(111);
    }
}
