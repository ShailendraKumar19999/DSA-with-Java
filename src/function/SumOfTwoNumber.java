package function;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
//        int result = sum();
//        int result = sum2(num1, num2);
        int result = sum2(20, 30);
        System.out.println("Sum of two number : " + result);
    }

    static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        return num1 + num2;
    }

    static int sum2(int a, int b) {

        return a + b;
    }

}
