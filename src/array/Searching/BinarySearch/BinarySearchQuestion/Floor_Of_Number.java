package array.Searching.BinarySearch.BinarySearchQuestion;

import java.util.Scanner;

public class Floor_Of_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 17;

        // Floor of number is that find the greatest array item which is <= target element
        int ans = floorOfNumber(arr, target);
        System.out.println(arr[ans]);
    }

    static int floorOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return end;
    }
}
