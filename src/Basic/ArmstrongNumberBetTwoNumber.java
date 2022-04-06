package Basic;


import java.util.Scanner;

public class ArmstrongNumberBetTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Range between two number : ");
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int i = firstNumber;
        for (; i < secondNumber; i++) {
            int armstrongNumber = 0, digitCount = 0;
            int temp1 = i, temp2 = i;
            while (temp1 > 0) {
                temp1 = temp1 / 10;
                digitCount++;
//                System.out.println(digitCount);
            }

            while (temp2 > 0) {
                int rem = temp2 % 10;
                armstrongNumber = armstrongNumber + (int) (Math.pow(rem, digitCount));
                temp2 /= 10;
            }
            if (i == armstrongNumber) {
                System.out.print(i + " ");
            }

        }
    }
}
//0 1 2 3 4 5 6 7 8 9 153 370 371 407 (0 - 999)
