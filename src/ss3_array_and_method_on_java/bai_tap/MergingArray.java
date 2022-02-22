package ss3_array_and_method_on_java.bai_tap;

import java.util.Scanner;

public class MergingArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("<-------------------------------------------<<input of array1>>------------------------------------------------>");
        System.out.print("\n");
        System.out.print("input array1:");
        System.out.print("\n");
        System.out.print("enter array1's length = ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        int i = 0;
        while (i < size1) {
            System.out.print("array1[" + i + "] = ");
            array1[i] = scanner.nextInt();
            i++;
        }
        System.out.print("<-------------------------------------------<<input of array2>>------------------------------------------------>") ;
        System.out.print("\n");
        System.out.print("input array2:");
        System.out.print("\n");
        System.out.print("enter array1's length = ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        i = 0;
        while (i < size2) {
            System.out.print("array2[" + i + "] = ");
            array2[i] = scanner.nextInt();
            i++;
        }
        System.out.print("<--------------------------------------------<<merging 2 array>>----------------------------------------------->" );
        System.out.print("\n");
        int[] array = new int[size1 + size2];
        for (int j = 0; j < array1.length; j++) {
            array[j] = array1[j];
        }
        for (int j = 0; j < array2.length; j++) {
                array[array1.length+j] = array2[j];
        }
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
