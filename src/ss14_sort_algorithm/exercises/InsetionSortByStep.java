package ss14_sort_algorithm.exercises;

import java.util.Scanner;

public class InsetionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = scanner.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
    }

    public static void insertionSort(int[] array) {
        boolean needNextPass = true;
        int pos, x;
        for (int k = 1; k < array.length && needNextPass; k++) {
            needNextPass = false;
            for (int i = 1; i < array.length; i++) {
                x = array[i];
                pos = i;
                if (pos > 0 && x < array[pos - 1]) {
                    array[pos] = array[pos - 1];
                    pos--;
                    needNextPass = true; /* Next pass still needed */
                }
                array[pos] = x;
            }
            /* Array may be sorted and next pass not needed */
            if (needNextPass == false) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            /* Show the list after sort */
            System.out.print("List after the  " + k + "' sort: ");
            System.out.print("List after the sort: ");
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j] + "\t");
            }
            System.out.println();
        }
    }
}
