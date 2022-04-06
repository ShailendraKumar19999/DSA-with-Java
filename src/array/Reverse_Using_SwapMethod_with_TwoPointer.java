package array;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse_Using_SwapMethod_with_TwoPointer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr, start, end); // call reverse function --> swap function
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end); // call swap function
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int start, int end) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
