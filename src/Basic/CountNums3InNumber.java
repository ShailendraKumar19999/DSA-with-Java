package Basic;

import java.util.Scanner;

public class CountNums3InNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            int remainder = num % 10;
            num /= 10;
            if (remainder == 3) {
                count++;
            }
        }
        System.out.println("Digit 3 repeated : " + count + " times");
    }
}
