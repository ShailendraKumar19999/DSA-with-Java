package Basic;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        int sum = 0, temp = num;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == temp) {
            System.out.println(temp + " is Perfect Number.");
        } else {
            System.out.println(temp + " is not Perfect Number.");
        }
    }
}

// perfect number is the sum of divisor except number is equal to that number
// 6 = 1, 2, 3(factors)  (1+2+3==6) same as 28 is perfect Number
