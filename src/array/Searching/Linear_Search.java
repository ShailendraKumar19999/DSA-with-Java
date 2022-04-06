package array.Searching;

import java.util.Scanner;

public class Linear_Search {
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

        int ans = linerSearch(arr, target);
        int ans2 = linerSearch2(arr, target);
        boolean ans3 = linerSearch3(arr, target);
        System.out.println("found index at : " + ans);
        System.out.println("target elements is : " + ans2);
        System.out.println("target elements found : " + ans3);
    }

    // search target and return index of target elements
    static int linerSearch(int[] arr, int target) {

        // check if array is empty then return -1
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (target == element) {
                return index; // return index value of target element
            }
        }
        return -1; // return if target element not found
    }

    // 2. search target and return target elements
    static int linerSearch2(int[] arr, int target) {

        // check if array is empty then return -1
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (target == element) {
                return element; // return target element
            }
        }
        return Integer.MAX_VALUE; // return Integer max value because
        // if return -1 it may be a case where element is -1, so we did not return -1 if target element not found
    }

    static boolean linerSearch3(int[] arr, int target) {

        // check if array is empty then return -1
        if (arr.length == 0) {
            return false;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (target == element) {
                return true; // return  target element true if target found
            }
        }
        return false; // return false if target element not found
    }
}
