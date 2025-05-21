public class GCD_Efficient {
    static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        int res = gcd(num1, num2);
        System.out.println(res);
    }

}
