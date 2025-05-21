public class GCD_Naive {
    static int gcd(int a, int b) {
        int res = Math.min(a, b);

        while (res > 0) {
            if (a % res == 0 && b % res == 0) {
                break;
            }
            res--;
        }
        return res;

    }

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        int res = gcd(num1, num2);
        System.out.println(res);
    }

}
