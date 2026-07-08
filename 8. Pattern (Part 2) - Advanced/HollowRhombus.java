
public class HollowRhombus {

    public static void Hollow_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            //for hollow rhomus
            for (int j = 1; j <= n; j++) {
                if (j == 1 || i == 1 || i == n || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Hollow_Rhombus(5);
    }
}
