package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(5);

        for (int i = 0; i < 6; i++) {
            list.add(sc.nextInt());
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        //OR

        System.out.println(list + " ");
        list.remove(3); // remove element from index 3
        System.out.println(list + " ");

        list.add(0, 99); // add index 0 = 99;
        System.out.println(list + " ");

        list.set(0, 999); // set 0 index value to --> 999
        System.out.println(list + " ");
    }
}
