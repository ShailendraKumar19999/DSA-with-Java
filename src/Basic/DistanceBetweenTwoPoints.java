package Basic;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Point (x1, x2)  : ");
        float pointx1 = sc.nextFloat();
        float pointx2 = sc.nextFloat();
        System.out.print("Enter Second Point(y1, y2) : ");
        float pointy1 = sc.nextFloat();
        float pointy2 = sc.nextFloat();

        float distanceBetweenTwoPoints = (float) (Math.sqrt((pointx1 - pointx2) * (pointx1 - pointx2) - (pointy1 - pointy2) * (pointy1 - pointy2)));
        System.out.println("Distance between " + "(" + pointx1 + ", " + pointx2 + ")" + " and " + "(" + pointy1 + ", " + pointy2 + ")" + " is : " + distanceBetweenTwoPoints);
    }
}
