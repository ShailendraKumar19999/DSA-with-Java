package Basic;

import java.util.Scanner;

public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount and commission Amount : ");
        float amount = sc.nextFloat();
        float commissionAmount = sc.nextFloat();
        float commissionRate = (commissionAmount * 100) / amount;
        System.out.println("Commission Rate is : " + commissionRate + "%");
    }
}
