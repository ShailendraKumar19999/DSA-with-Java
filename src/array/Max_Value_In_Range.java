package array;

import java.util.Arrays;
import java.util.Scanner;

public class Max_Value_In_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size : ");
        int size = sc.nextInt();


        int[] arr = new int[size];

        System.out.println("Enter Array Elements  :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));


        int maxItem = maxRange(arr);
        System.out.println("Max Element : " + maxItem);

    }

    static int maxRange(int[] arr) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Start and End Range : ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        int maxValue = arr[start];
        if (arr.length == 0) {
            return -1;
        }
        if (end < start) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
            }
        }

        return maxValue;
    }
}
