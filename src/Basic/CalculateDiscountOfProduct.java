package Basic;

import java.util.Scanner;

public class CalculateDiscountOfProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Actual Price : ");
        float price = sc.nextFloat();
        System.out.print("Enter Discount Percentage : ");
        float discPercentage = sc.nextFloat();
        float discPrice = price * discPercentage / 100;
        float finalPrice = price - discPrice;
        System.out.println("Final Product cost is : " + finalPrice);
    }
}
