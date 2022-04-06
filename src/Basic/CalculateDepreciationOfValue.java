package Basic;

import java.util.Scanner;

public class CalculateDepreciationOfValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value at certain time : ");
        float valueAtCertainTime = sc.nextFloat();
        System.out.print("Enter Rate : ");
        float rate = sc.nextFloat();
        System.out.print("Enter  time in year : ");
        float time = sc.nextFloat();

        // v2 = v1[1-r/100]^t  v1 is initial value
        float valueAfterTime = valueAtCertainTime * ((float) Math.pow((1 - rate / 100), time));

        System.out.println("Value after " + time + " year " + " is : " + valueAfterTime);
    }
}
