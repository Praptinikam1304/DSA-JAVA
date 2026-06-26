
public class Unary {

    public static void main(String[] args) {
        int a = 10;
        int b = ++a; // Pre-increment: a is incremented before assignment to b
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
        //Post-increment: a is assigned to b before incrementing a
        b = a++;
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
        // Pre-decrement: a is decremented before assignment to b
        b = --a;
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
        // Post-decrement: a is assigned to b before decrementing a
        b = a--;
        System.out.println("The value of a is: " + a);
        System.out.println("The value of b is: " + b);
    }
}
