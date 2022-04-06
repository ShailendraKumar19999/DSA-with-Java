package Basic;

import java.util.Scanner;

public class EvenDayCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;
        for (int i = 1; i <= 31; i++) {
            if (i % 2 == 0) {
                count++;
            }
        }
        System.out.println("Kunal Can Go Outside of even day in August months : " + count);
    }
}
