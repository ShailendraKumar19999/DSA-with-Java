package Basic;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String : ");
        String text = sc.nextLine();
        String ans = reverse(text);
        System.out.println(ans);

    }

    static String reverse(String str) {
        String revText = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            revText += str.charAt(i);
        }
        return revText;
    }
}
