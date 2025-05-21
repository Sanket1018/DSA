public class LCM_Efficient {
    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        int res = lcm(num1, num2);
        System.out.println(res);

    }

}
