package Basic;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter String : ");
        String str = sc.next();
        int j = str.length(), i = 0;
        boolean isPalindrome = true;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j - 1)) {
                isPalindrome = false;
            }
            i++;
            j--;
        }
        if (isPalindrome) {
            System.out.println(str + " is  Palindrome");
        } else {
            System.out.println(str + " is not Palindrome");
        }

    }
}
