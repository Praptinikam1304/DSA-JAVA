//*
//**
//***
//****

public class Starpattern {

    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) { //no of lines
            for (int j = 1; j <= i; j++) { // line madhe kiti star
                System.out.print("*");//print star
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
