package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Min_Max_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(size);

        for (int i = 0; i < size; i++) {
            arr.add(sc.nextInt());
        }
        System.out.println(arr);

        Collections.shuffle(arr); // shuffle the array items
        System.out.println(arr);

        int maxItem = max(arr);
        System.out.println(" Max Element : " + maxItem);

    }

    static int max(ArrayList<Integer> arr) {
        int maxValue = Integer.MIN_VALUE;
        if (arr.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < arr.size(); i++) {
            if (maxValue < arr.get(i)) {
                maxValue = arr.get(i);
            }
        }
        return maxValue;
    }
}
