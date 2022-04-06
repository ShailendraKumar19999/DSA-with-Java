package Basic;

import java.util.Scanner;

public class GCDOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans = Gcd(num1, num2);
        System.out.println("GCD Of " + num1 + " and " + num2 + " is :" + ans);
    }

    static int Gcd(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return Gcd(num2, num1 % num2);
    }

}
