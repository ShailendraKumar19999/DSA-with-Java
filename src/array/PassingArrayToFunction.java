package array;

import java.util.Arrays;
import java.util.Scanner;

public class PassingArrayToFunction {
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

        System.out.println("Modified String Arrays Elements : ");
        changeStringArray(str);
        System.out.println(Arrays.toString(str));
    }

    static void changeStringArray(String[] change) {
        change[0] = "Shailendra";
    }
}
