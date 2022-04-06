package array.Searching;

import java.util.Scanner;

public class Search_In_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter elements : ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter Target element : ");
        int target = sc.nextInt();
        System.out.print("Enter start and end number : ");
        int start = sc.nextInt();
        int end = sc.nextInt();


        int ans = linerSearch(arr, target, start, end);

        System.out.println("found index at : " + ans);
    }

    static int linerSearch(int[] arr, int target, int start, int end) {

        // check if array is empty then return -1
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (target == element) {
                return index; // return index value of target element
            }
        }
        return -1; // return if target element not found
    }
}
