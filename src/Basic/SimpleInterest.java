package Basic;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount : ");
        float principalAmount = sc.nextFloat();
        System.out.print("Enter Rate : ");
        float rate = sc.nextFloat();
        System.out.print("Enter Time : ");
        float time = sc.nextFloat();

        float simpleInterest = (principalAmount * rate * time) / 100;
        System.out.println("Simple Interest is : " + simpleInterest);


    }
}
