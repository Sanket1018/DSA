public class Prime_Numbers_Naive {
    static boolean isPrime(int n) {
        if (n == 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 8;
        boolean res = isPrime(num);
        if (res == true) {
            System.out.println(num + " is prime number");
        } else {
            System.out.println(num + " is not prime number");
        }

    }

}
