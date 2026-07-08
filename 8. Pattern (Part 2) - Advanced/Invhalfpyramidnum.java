
public class Invhalfpyramidnum {

    public static void Inverted_half_pyramid_withnumbers(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Inverted_half_pyramid_withnumbers(5);
    }
}
