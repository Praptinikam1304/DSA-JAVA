//****
//***
//**
//*

public class Invertedstarpattern {

    public static void main(String[] args) {
        //no of lines = 4
        for (int i = 1; i <= 4; i++) { //outer loop for lines
            //line madhe kiti star = 4-i+1
            for (int j = 1; j <= 4 - i + 1; j++) { //inner loop for stars
                System.out.print("*");//print star
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
