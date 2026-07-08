
public class SolidRhombus {

    public static void Solid_Rhombus(int num) {
        //outer loop
        for (int i = 1; i <= num; i++) {
            //inner loop
            //spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Solid_Rhombus(5);
    }
}
