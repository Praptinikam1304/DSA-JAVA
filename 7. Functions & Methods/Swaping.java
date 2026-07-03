//java madhe call by reference vaprat nahi , call by value ch vaparto

public class Swaping {

    public static void swap(int a, int b) {
        // Swapping using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        //normal method to swap two numbers
        int a = 10;
        int b = 20;
        // Swapping using a temporary variable
        //int temp = a;
        //a = b;
        //b = temp;
        //System.out.println("After swapping: a = " + a + ", b = " + b); 
        //swap(a, b); - call by value hyat copy provide keli jatey to swap function anhi main function madhe kahich change nahi hota
        //System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
