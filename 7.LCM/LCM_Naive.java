public class LCM_Naive {
    static int lcm(int a, int b) {
        int res = Math.max(a, b);
        while (true) {
            if (res % a == 0 && res % b == 0)
                return res;
            res++;
        }
    }

    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        int res = lcm(num1, num2);
        System.out.println(res);

    }

}
