/*
*              *
**            **
***          ***
****        ****
*****      *****
******    ******
*******  *******
****************
****************
*******  *******
******    ******
*****      *****
****        ****
***          ***
**            **
*              *
 */

public class Butterfly {

    public static void Butterfly(int num) {
        //1st half
        //outer loop
        for (int i = 1; i <= num; i++) {
            //inner loop
            //stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //spaces
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print(" ");
            }

            //stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        //outer loop 
        for (int i = num; i >= 1; i--) {
            //inner loop
            //stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //spaces
            for (int j = 1; j <= 2 * (num - i); j++) {
                System.out.print(" ");
            }

            //stars - i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Butterfly(8);

    }
}
