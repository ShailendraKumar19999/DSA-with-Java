package array;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row  and column: ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        System.out.println("Enter Elements : ");
        int[][] array2D = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                array2D[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }

        // OR

        for (int i = 0; i < row; i++) {
            System.out.println(Arrays.toString(array2D[i]));
        }

    }
}
