//A
//BC
//DEF
//GHIJ

public class Charcontinpattern {

    public static void main(String[] args) {
        int n = 4; // Number of rows
        char ch = 'A'; // Starting character

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
                ch++; // Move to the next character
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
