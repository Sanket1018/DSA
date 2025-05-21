public class Prime_Numbers_Efficient {
    static boolean isPrime(int n) {
        if (n == 1)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 8;
        boolean res = isPrime(num);

        if (res == true) {
            System.out.println(num + " is Prime number");
        } else {
            System.out.println(num + " is not Prime number");
        }
    }

}
