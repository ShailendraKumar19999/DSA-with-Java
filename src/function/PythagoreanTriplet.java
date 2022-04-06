package function;

import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers : ");
        int first = sc.nextInt();
        int second = sc.nextInt();
        int third = sc.nextInt();
        boolean ans = isPythagoreanTriplet(first, second, third);
        System.out.println(ans);
    }

    static boolean isPythagoreanTriplet(int a, int b, int c) {
        if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == a * a + b * b)) {
            return true;
        }
        return false;
    }
}
