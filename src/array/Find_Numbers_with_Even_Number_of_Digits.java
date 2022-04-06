package array;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items or size : ");
        int size = sc.nextInt();
        long[] arr = new long[size];
        System.out.print("Enter numbers of array : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextLong();

        }
        System.out.println(Arrays.toString(arr));
        int ans = findNumberOfEvenDigit(arr);
        System.out.println("Number of evenDigit : " + ans);
    }

    // this function count the number which has number of digit is even
    static int findNumberOfEvenDigit(long[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (evenDigit(arr[i])) {
                count++;
            }
        }
        return count;
    }

    // this function check number of digit is even or not
    static boolean evenDigit(long l) {
        if (digit(l) % 2 == 0) { //
            return true;
        }
        return false;
    }

    // this function count the number of digits
    static int digit(long num) {
        if (num < 0) { // this make negative to positive (-100 -> +100)
            num *= -1;
        }
        if (num == 0) {
            return 1;
        }
        return (int) (Math.log10(num)) + 1; // this return number of digits
    }
}
