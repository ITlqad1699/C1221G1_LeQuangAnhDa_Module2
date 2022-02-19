package ss3_array_and_method_on_java.bai_tap;

import java.util.Scanner;

public class FindingMininumOfArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("<----------------------------------------input of 2D matrix-------------------------------------------------->\n");
        System.out.print("enter matrix rows = ");
        int rows = scanner.nextInt();
        System.out.print("enter matrix colums = ");
        int colums = scanner.nextInt();
        int[][] matrix = new int[rows][colums];
        System.out.println("Enter " + matrix.length + " rows and " +
                matrix[0].length + " columns: ");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print("array1[" + row +"]"+"["+column+ "] = ");
                matrix[row][column] = scanner.nextInt();
            }
        }
        System.out.println("<----------------------------------------print 2D matrix-------------------------------------------------->\n");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("<----------------------------------------find manimum of 2D matrix-------------------------------------------------->\n");
        int min = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (min > matrix[row][column]){
                    min = matrix[row][column];
                }
            }
        }
        System.out.print("the maximum alement is: "+min);
    }
}
