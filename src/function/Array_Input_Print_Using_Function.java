package function;

import java.util.Scanner;

public class Array_Input_Print_Using_Function {
    public static void main(String[] args) {

        int[] arr = inputArray();
        printArray(arr);
    }

    public static int[] inputArray() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter  array elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
        }
        return array;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


