package Basic;

import java.util.Scanner;

public class CalculateElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total units consumed : ");
        float units = sc.nextFloat();
        float totalBill = 0, finalBill = 0;
        //        how to calculate electric bill

        //        For first 50 units Rs. 0.50/unit
        //        For next 100 units Rs. 0.75/unit
        //        For next 100 units Rs. 1.20/unit
        //        For unit above 250 Rs. 1.50/unit
        //        An additional surcharge of 20% is added to the bill.

        // first 50 units means till 50 (0-50) has charge 0.50 then bill = [0-50]units * 0.50

        // for next 100 means 100 units means (units > 50 && units <=150) or (units <=150) 150-50 = 100 unites
        // if unit is 150 (50 + 100) then  bill = first 50 units * 0.50 + (units-50)*0.75

        // for next 100 units means (units > 150 && units<=250) or (units <=250) means  250-150 =100 units
        // if unit is 250 (50 + 100 + 100) then  bill = first 50 units * 0.50 + 100 *0.75 + (units-150)*1.20

        // if unit > 250  (ex - 300) (50 + 100 + 100 + (units-250))
        //then  bill = (50 * 0.50) + (100 *0.75) + (100 * 1.20) + (units-250)*1.50

        // final total bill = bill + bill * 0.20%


        if (units <= 50) {
            totalBill = (units * 0.50f);
        } else if (units <= 150) {
            totalBill = (units * 0.50f) + ((units - 50) * 0.75f);
        } else if (units <= 250) {
            totalBill = (units * 0.50f) + (100 * 0.75f) + ((units - 150) * 1.20f);
        } else {
            totalBill = (units * 0.50f) + (100 * 0.75f) + (100 * 1.20f) + ((units - 250) * 1.20f);
        }
        float surcharge = totalBill * 0.20f;
        finalBill = totalBill + surcharge;

        System.out.println("Total Electric Bill of " + units + " units is : " + finalBill);
    }

}
