package array.Searching.BinarySearch;

import java.util.Scanner;

public class BinaryOrderAgnostic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements in sorted order : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target Element : ");
        int target = sc.nextInt();


        int ans = binarySearch(arr, target); // here return index of target element
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // check array is in increasing order or not
        boolean isAsc = arr[start] < arr[end];

        // check if array is empty then return -1
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                System.out.print("target found at index : ");
                return mid;

            }

            // if this block is true means array is in ascending order
            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            // this block is in descending order
            else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }


        }
        System.out.println("target not found");
        return -1; // here if target is not find return -1
    }
}
