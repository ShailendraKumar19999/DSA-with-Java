package array.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Array_2D_Searching {
    public static void main(String[] args) {
       /* int[][] arr2d = {
                {1, 2, 3, 4},
                {5, 6, 7},
                {8, 9, 10}
        };
        int target = 6;

        */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of row and column: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] arr2d = new int[row][col];
        System.out.print("Enter elements : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(arr2d[i]));
        }
        System.out.print("Enter target element: ");
        int target = sc.nextInt();

        int[] ans = search2DArray(arr2d, target); // here store array [row,col]
        System.out.println(Arrays.toString(ans));

    }

    static int[] search2DArray(int[][] arr2d, int target) { // here return arr[]

        if (arr2d.length == 0) {
            System.out.print("Target element not found ");
            return new int[]{-1, -1};
        }
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                if (arr2d[row][col] == target) {
                    System.out.print("Target element found at index :[row,col] ");
                    return new int[]{row, col}; // return itself arr [row,col]
                }
            }
        }
        System.out.print("Target element not found ");
        return new int[]{-1, -1};
    }
}
