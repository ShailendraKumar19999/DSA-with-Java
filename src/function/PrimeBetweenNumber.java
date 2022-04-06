package function;

import java.util.Scanner;

public class PrimeBetweenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter range : ");
        int first = sc.nextInt();
        int last = sc.nextInt();
        int count = 0;
        for (int i = first; i <= last; i++) {
            if (isPrime(i)) {
                count++;
                System.out.print(i + " ");

            }
        }
        System.out.println("\nTotal Number of Prime : " + count);

    }

    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
