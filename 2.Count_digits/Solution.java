import java.util.Scanner;

class Solution {
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            num = num / 10;
            ++count;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int res = countDigits(num);
        System.out.println(res);
        sc.close();
    }

}