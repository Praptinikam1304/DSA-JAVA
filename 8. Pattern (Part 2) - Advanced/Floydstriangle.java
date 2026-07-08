
public class Floydstriangle {

    public static void Floyds_triangle(int num) {
        int counter = 1;
        //outer loop 
        for (int i = 1; i <= num; i++) {
            //inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Floyds_triangle(5);
    }
}
