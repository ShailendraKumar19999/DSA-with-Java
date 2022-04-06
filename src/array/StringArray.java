package array;

import java.util.Arrays;
import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        String[] str = new String[size];
        System.out.println("Enter Elements : ");

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }

        System.out.println("Elements : ");
        System.out.println(Arrays.toString(str));

        // ((Object) size).getClass().getSimpleName() for checking data type
        float a = 2.34567f;
        System.out.println("Type of size is : " + ((Object) size).getClass().getSimpleName());

        System.out.printf("%.2f", a); // for precision up-to decimal point
    }
}
