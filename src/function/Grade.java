package function;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks out of 100 : ");
        int marks = sc.nextInt();
        String grade = gradeOfStudents(marks);
        System.out.println("Grade " + grade);

    }

    static String gradeOfStudents(int n) {
        if (n >= 91 && n <= 100) {
            return "AA";
        } else if (n >= 81 && n <= 90) {
            return "AB";
        } else if (n >= 71 && n <= 80) {
            return "BB";
        } else if (n >= 61 && n <= 70) {
            return "BC";
        } else if (n >= 51 && n <= 60) {
            return "CD";
        } else if (n >= 41 && n <= 50) {
            return "DD";
        }
        return "Fail";
    }
}
