package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] result = new int[size];
        System.out.println("Enter Elements : ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        result = arr;

        System.out.println("Elements : ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // or

        for (int item : arr) { // for every element in the array , print elements
            System.out.print(item + " "); // item represents the elements of array
        }
        // System.out.println(arr[5]); // error ArrayIndexOutOfBoundsException

        //or
        System.out.println(Arrays.toString(arr));
        System.out.println("Result " + Arrays.toString(arr));
    }
}
