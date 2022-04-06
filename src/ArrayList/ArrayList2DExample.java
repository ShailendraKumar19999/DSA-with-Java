package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2DExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        // initialisation

        for (int row = 0; row < 3; row++) {
            list.add(new ArrayList<>()); // here list is initially null all elements
        }

        // adding elements into 2D list

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                list.get(row).add(sc.nextInt()); // Here get Existing value and update with user value
            }
        }

        // Print

        System.out.println(list);
    }
}
