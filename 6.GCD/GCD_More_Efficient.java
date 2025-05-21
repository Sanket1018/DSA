public class GCD_More_Efficient {
    static int gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        int result = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + result);

    }

}
