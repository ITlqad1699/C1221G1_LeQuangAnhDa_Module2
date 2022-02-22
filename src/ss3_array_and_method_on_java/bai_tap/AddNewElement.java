package ss3_array_and_method_on_java.bai_tap;

import java.util.Scanner;

public class AddNewElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("<-------------------------------------------<<input of an array>>------------------------------------------------>" + "\n");
        System.out.print("enter array length: ");
        int size = scanner.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("array[" + i + "] = ");
            array1[i] = scanner.nextInt();
            i++;
        }
        System.out.print("<-------------------------------------------<<enter an element and index that you want to add>>------------------------------------------------>" + "\n");
        System.out.print("enter an element: ");
        int element = scanner.nextInt();
        System.out.print("enter an index: ");
        int index = scanner.nextInt();
        if ((index <= -1) || (index >= array1.length)) {
            System.out.println("we can't insert new element into this array");
        } else {
            for (int j = 0; j < array1.length; j++) {
                if (j < index) {
                    array2[j] = array1[j];
                } else if (j == index) {
                    array2[j] = element;
                } else {
                    array2[j] = array1[j - 1];
                }
            }
        }
        System.out.print("<-------------------------------------------<<your array after add new element>>------------------------------------------------>" + "\n");
        for (int j = 0; j < array2.length; j++) {
            System.out.print(array2[j] + "\t");
        }
    }
}
