package ss3_array_on_java.bai_tap;

import java.util.Scanner;

public class DeleteElementOfArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter array length: ");
        int elements = scanner.nextInt();
        int[] array = new int[elements];
        for (int i =0; i<array.length; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = scanner.nextInt();
        }

        System.out.print("enter an element: ");
        int element = scanner.nextInt();
        for (int j = 0; j < array.length-1; j++) {
            if (array[j] == element) {
                for (int k = j; k < array.length-1; k++) {
                    array[k] = array[k + 1];
                }
            }
        }
        array[array.length-1] = 0;
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
