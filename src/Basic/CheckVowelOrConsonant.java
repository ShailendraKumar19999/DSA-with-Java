package Basic;

import java.util.Scanner;

public class CheckVowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character (a-z or A-Z) : ");
        char ch = sc.next().trim().charAt(0);
        if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') {
            System.out.println(ch + " is Vowel ");
        } else {
            System.out.println(ch + " is Consonant ");
        }
    }
}
