
public class Iseven {

    public static boolean Iseven(int num) {
        boolean IsEven = true;
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean result = Iseven(13);
        System.out.print(result);
    }
}
