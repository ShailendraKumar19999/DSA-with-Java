package Basic;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1 :");
        float num1 = sc.nextFloat();
        System.out.print("Enter number2 :");
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        System.out.println("Sum of two number :" + sum);

    }
}
