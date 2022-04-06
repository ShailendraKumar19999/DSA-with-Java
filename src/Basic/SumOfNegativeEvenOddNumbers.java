package Basic;

import java.util.Scanner;

public class SumOfNegativeEvenOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers");
        int negSum = 0, oddSum = 0, evenSum = 0;
        while (true) {
            int num = sc.nextInt();
            if (num < 0) {
                negSum += num;
            } else if (num > 0) {
                if (num % 2 == 0) {
                    evenSum += num;
                } else {
                    oddSum += num;
                }
            } else {
                break;
            }
        }
        System.out.println("Sum of Negative Numbers : " + negSum);
        System.out.println("Sum of Positive Even Numbers : " + evenSum);
        System.out.println("Sum of Positive Odd Numbers : " + oddSum);
    }
}
