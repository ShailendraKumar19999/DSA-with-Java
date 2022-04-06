package function;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        greeting(name);
        System.out.println("Hello " + name); //here name is not changed
    }

    static void greeting(String name) {
        name = "Hi";
//        System.out.println("Hello " + naam);
    }
}
