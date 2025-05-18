import java.util.Scanner;

class Pallindrome {

    private static boolean calPallindrom(int n) {
        int temp = n;
        int rev = 0;
        int rem = 0;

        while (temp != 0) {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        return rev == n;
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean result = calPallindrom(num);

        if (result == true) {
            System.out.println("The given number " + num + " is Pallindrome number");
        } else {
            System.out.println("The given number " + num + " is not Pallindrome number");

        }
        sc.close();

    }

}