package Basic;

import java.util.Scanner;

public class SumOfAllNumbersTillUserPress0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numbers :");
        int sum = 0;
        int result;
        while (true) {
            int num = sc.nextInt();
            sum += num;
            result = sum;
            if (num == 0) {
                break;
            }

//            for(int i = 0; ;){
//                sum +=num;
//            }
        }
        System.out.println("Sum of all number is : " + result);

    }
}
