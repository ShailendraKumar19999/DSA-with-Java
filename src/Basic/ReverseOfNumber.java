package Basic;

import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse = 0, temp = num;
        while (num > 0) {
            int remainder = num % 10;
            num /= 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("Reverse of " + temp + " is : " + reverse);
    }
}
