
public class Binomial {

    public static int factorial(int num) {
        int f = 1;
        for (int i = 1; i <= num; i++) {
            f *= i;
        }
        return f;
    }

    public static int binomial(int n, int r) {
        int nFact = factorial(n);
        int rFact = factorial(r);
        int nMinusRFact = factorial(n - r);
        int binomialCoefficient = nFact / (rFact * nMinusRFact);
        return binomialCoefficient;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int result = binomial(n, r);
        System.out.println("The binomial coefficient of " + n + " and " + r + " is: " + result);
    }
}
