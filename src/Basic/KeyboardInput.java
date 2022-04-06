package Basic;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        System.out.println("Enter Name:");
        Scanner sc = new Scanner(System.in);
        //String name = sc.next(); // this will take only first word
        String name = sc.nextLine(); // this take whole sentence
        System.out.println(name);
    }
}
// nextInt() for integer
// nextLong() for long
// nextShort() for short
// nextByte() for byte
// nextBoolean() for boolean
// nextFloat() for float
// nextDouble() for double
// next() for string // only one word without space
// nextLine() for string


