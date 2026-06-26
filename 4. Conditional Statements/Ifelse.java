
public class Ifelse {

    public static void main(String[] args) {
        int age = 20;
        if (age >= 18) {
            System.out.println("adult:vote,drive");
        } else {
            System.out.println("not adult:can't vote,can't drive");
        }

        int num = 12;
        if (num >= 18) {
            System.out.println("adult:vote,drive");
        }
        if (num > 11 && num < 18) {
            System.out.println("teenager:can't vote,can drive");
        } else {
            System.out.println("not adult:can't vote,can't drive");
        }

    }
}
