package Basic;

import java.util.Scanner;

public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        int sum = 0;
        float average;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        average = sum / num;
        System.out.println("Average of " + num + " numbers is : " + average);
    }
}
