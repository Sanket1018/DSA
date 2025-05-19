import java.util.Scanner;

class Factorial_Recur {
    private static int fact(int num) {
        if (num == 0) {
            return 1;
        }
        return num * fact(num - 1);

    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = fact(num);

        System.out.println("Factorial of number " + result);
        sc.close();
    }

}