import java.util.Scanner;

class Factorial {
    private static int fact(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;

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