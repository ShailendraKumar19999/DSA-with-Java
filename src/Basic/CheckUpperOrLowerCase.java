package Basic;

import java.util.Scanner;

public class CheckUpperOrLowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().trim().charAt(0); // here trim remove space and charAt(0) gives first character
        if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is lower Case");
        } else {
            System.out.println(ch + " is Upper Case");
        }
    }
}
