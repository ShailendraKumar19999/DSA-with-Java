package Basic;

import java.util.Scanner;

public class LargestNumberFromAllTillUserPress0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers :");
        int max = 0;
        int result;
        while (true) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            }
            result = max;
            if (num == 0) {
                break;
            }

        }
        System.out.println("Max of all number is : " + result);

    }
}
