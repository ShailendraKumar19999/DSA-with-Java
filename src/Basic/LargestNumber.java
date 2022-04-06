package Basic;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter second Number : ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is Greater than " + num2);
        } else {
            System.out.println(num2 + " is Greater than " + num1);
        }
    }
}
