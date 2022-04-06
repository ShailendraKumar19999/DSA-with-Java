package Basic;

import java.util.Scanner;

public class CheckLeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 400 == 0 || year % 100 != 0) {
                System.out.println(year + " is leap Year.");
            } else {
                System.out.println(year + " is not leap Year.");
            }
        } else {
            System.out.println(year + " is not leap Year.");
        }
    }
}

// (year % 4 ==0) then check (year % 400 || year % 100 !=0 ) that gives leap year

// 1700 1800, 1900 not leap year
// 1600, 2000 leap year