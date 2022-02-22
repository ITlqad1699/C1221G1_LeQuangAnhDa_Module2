package ss3_array_and_method_on_java.bai_tap;

import java.util.Scanner;

public class SumOfColumn {
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
                System.out.print("array1[" + row + "]" + "[" + column + "] = ");
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
        System.out.println("<----------------------------------------Sum of elements in the column of 2D matrix-------------------------------------------------->\n");
        System.out.print("Enter the index of column: ");
        int index = scanner.nextInt();
        int sum = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (index == column) {
                    sum += matrix[row][index];
                }
            }
        }
        System.out.print("sum of elements in column " + index + " is: " + sum);
    }
}
