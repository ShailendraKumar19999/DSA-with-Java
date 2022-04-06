package function;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int ans = factorial(num);
        System.out.println("Factorial of " + num + " is : " + ans);
    }

    static int factorial(int n) {
        int fact = 1, i = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        return fact;
    }
}
