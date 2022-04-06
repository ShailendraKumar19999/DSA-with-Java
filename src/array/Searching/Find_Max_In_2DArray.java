package array.Searching;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Max_In_2DArray {
    public static void main(String[] args) {
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

        int ans = findMax(arr2d);
        System.out.println("Maximum Value : " + ans);

    }

    static int findMax(int[][] arr2d) {

        if (arr2d.length == 0) {
            System.out.print("Target element not found ");
            return Integer.MIN_VALUE;
        }
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr2d.length; row++) {
            for (int col = 0; col < arr2d[row].length; col++) {
                if (arr2d[row][col] > max) {
                    max = arr2d[row][col];
                }
            }
        }

        return max;

    }
}
