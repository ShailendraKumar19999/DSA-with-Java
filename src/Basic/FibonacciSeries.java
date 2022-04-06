package Basic;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number till you want to fibonacci series : ");
        int num = sc.nextInt();
        int i, sum;
        int a = 0, b = 1;
        System.out.print(a + "\t" + b + "\t");
        for (i = 2; i <= num; i++) {
            sum = a + b;
            a = b;
            b = sum;

            System.out.print(sum + "\t"); // 0

        }
    }
}
