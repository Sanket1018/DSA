import java.util.Scanner;

public class Prime_Numbers_More_Efficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        boolean res = isPrime(n);

        if (res == true) {
            System.out.println(n + " is a Prime number");
        } else {
            System.out.println(n + " is not Prime number");
        }

        sc.close();

    }

    private static boolean isPrime(int n) {
        if (n == 1)
            return false;

        if (n == 2 || n == 3)
            return true;

        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        return true;
    }

}
