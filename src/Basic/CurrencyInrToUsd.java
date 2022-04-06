package Basic;

import java.util.Scanner;

public class CurrencyInrToUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Currency in Indian Rupees (1 USD $ = 76.28 rupees) : ");
        float currency = sc.nextFloat();
        currency = currency / 76.28f;
        System.out.println("Currency in USD : $" + currency);
    }
}
