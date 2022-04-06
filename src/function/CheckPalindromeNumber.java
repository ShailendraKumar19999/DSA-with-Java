package function;

import java.util.Scanner;

public class CheckPalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        boolean ans = isPalindrome(num);
        System.out.println(ans);

    }

    static boolean isPalindrome(int n) {
        int temp = n, rev = 0;
        while (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        if (temp == rev) {
            return true;
        }
        return false;
    }
}
