package Basic;

import java.util.Scanner;

public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Total Runs : ");
        int totalRun = sc.nextInt();
        System.out.print("Enter Time Out : ");
        int out = sc.nextInt();

//        Batting Average = Runs Scored ÷ Times Out

//        “Runs Scored” – The number of runs scored by the batter.
//        “Times Out” – The number of times the batter has been caught out.

        float averageBatting = (float) totalRun / out;
        System.out.println("Average Batting : " + averageBatting);

    }
}
