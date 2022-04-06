package Basic;

import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Present Value : ");
        float presentValue = sc.nextFloat();
        System.out.print("Enter Present Rate : ");
        float presentRate = sc.nextFloat();
        System.out.print("Enter Time-Period : ");
        float time = sc.nextFloat();
        // future value = present value * ((1 + rate/100 ) ** time)
        float futureValue = (float) (presentValue * Math.pow((1 + presentRate / 100), time));
        System.out.println("Future Value is : " + futureValue);
    }
}
