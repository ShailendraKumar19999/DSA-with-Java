package array.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Searching_Char_In_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String : ");
        String str = sc.nextLine();
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.print("Enter Target character : ");
        char target = sc.next().charAt(0);

        int ans = searchInString(str, target);
        System.out.println("target character  found at :" + ans);
        boolean ans2 = searchInString2(str, target);
        System.out.println("target character found :" + ans2);
    }

    static int searchInString(String str, char target) {


        if (str.length() == 0) {
            return -1;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return i;
            }
        }

        return -1;
    }

    static boolean searchInString2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        // Or
        for (char ch : str.toCharArray()) { // toCharArray() used to convert string to character array
            //example name ="raja" split into ['r','a','j','a']
            if (target == ch) {
                return true;
            }
        }
        return false;
    }
}
