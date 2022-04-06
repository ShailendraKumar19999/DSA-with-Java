package Basic;

import java.util.Scanner;

public class SubtractProductAndSumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = sc.nextInt();
        int sum = 0, product = 1;
        while (number > 0) {
            int rem = number % 10;
            sum += rem;
            product *= rem;
            number /= 10;
        }
        int result = product - sum;
        System.out.println("Result is : " + result);
    }
}
