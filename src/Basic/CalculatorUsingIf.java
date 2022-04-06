package Basic;

import java.util.Scanner;

public class CalculatorUsingIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float result = 0;
        while (true) {
            System.out.print("Enter Operator( +, -, /, %, *) : ");
            char operator = sc.next().charAt(0);
            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {
                System.out.print("Enter two Numbers : ");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                if (operator == '+') {
                    result = num1 + num2;
                } else if (operator == '-') {
                    result = num1 - num2;
                } else if (operator == '*') {
                    result = num1 * num2;
                } else if (operator == '/') {
                    if (num2 != 0) {
                        result = num1 / num2;
                    }
                }
            } else if (operator == 'x' || operator == 'X') {
                break;
            } else {
                System.out.println("Invalid Operation");
            }
            System.out.println("Result : " + result);
        }


    }
}
