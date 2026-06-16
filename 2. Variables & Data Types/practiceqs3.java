
import java.util.*;

public class practiceqs3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float totalCost = pencil + pen + eraser;
        float GST = (totalCost * 18) / 100;
        totalCost = totalCost + GST;
        System.out.println("The total cost of the items is: " + totalCost);
    }
}
