public class Trailing_Zeros_Naive {
    static int countZeros(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        int res = 0;
        while (fact % 10 == 0) {
            res++;
            fact = fact / 10;
        }
        return res;

    }

    public static void main(String[] args) {
        int num = 10;
        int res = countZeros(num);
        System.out.println(res);
    }

}
