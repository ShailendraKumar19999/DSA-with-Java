package Basic;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int sum = 0, temp = num;
        while (num > 0) {
            int rem = num % 10;
            sum += rem;
            num /= 10;
        }
        System.out.println("Sum of Digit of " + temp + " is : " + sum);
    }
}
