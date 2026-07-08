
public class Palindromicnum {

    public static void Palinnum_pattern(int n) {
        //outer loop
        for (int i = 1; i <= n; i++) {
            //spacing
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //decsending num
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            //ascending num
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Palinnum_pattern(8);
    }
}
