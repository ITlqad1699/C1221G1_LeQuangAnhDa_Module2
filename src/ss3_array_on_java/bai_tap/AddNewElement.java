package ss3_array_on_java.bai_tap;
import java.util.Scanner;
public class AddNewElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter array length: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int i = 0;
        while (i < size) {
            System.out.print("array[" + i + "] = ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.print("enter an element: ");
        int element = scanner.nextInt();
        System.out.print("enter an index: ");
        int index = scanner.nextInt();
        if ((index < -1) || (index >= array.length-1)){
            System.out.println("Wrong index");
        }
    }
}
