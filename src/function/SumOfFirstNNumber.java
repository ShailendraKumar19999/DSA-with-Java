package function;

import java.util.Scanner;

public class SumOfFirstNNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int ans = sumOfNumber(num);
        System.out.println("Sum Of " + num + " Natural Numbers : " + ans);
    }

    static int sumOfNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
