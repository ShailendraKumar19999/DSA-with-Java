package Basic;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        type casting float --> int
        int num = (int) (65.56f);
        System.out.println(num);

        //int a= 257;
        //byte b = (byte)a; // because byte max value holds 256 but here a has 257
        //System.out.println(b); // so it will give output as remainder of 257 % 256 = 1


        // type promotion
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.2456;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println((f * b) + " " + (i / c) + " " + (d - s));
        System.out.println(result);

        // f * b -> float * byte -> float( here byte converted into float) so on...
        // float - int + double = double(double is larger )

    }
}
