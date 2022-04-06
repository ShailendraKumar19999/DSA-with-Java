package Basic;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        float radius = sc.nextFloat();
        // PI * r * r
        float areaOfCircle = (float) (Math.PI * radius * radius);
        System.out.println("Area Of Circle : " + areaOfCircle);
    }
}
