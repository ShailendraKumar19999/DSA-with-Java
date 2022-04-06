package Basic;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount : ");
        float priceAmount = sc.nextFloat();
        System.out.print("Enter Present Rate : ");
        float rate = sc.nextFloat();
        System.out.print("Enter Time-Period : ");
        float time = sc.nextFloat();
        // Compound Interest = P * ((1 + rate/100 ) ** time)-P
        float compoundInterest = (float) (priceAmount * Math.pow((1 + rate / 100), time) - priceAmount);
        System.out.println("Compound Interest is : " + compoundInterest);
    }
}
