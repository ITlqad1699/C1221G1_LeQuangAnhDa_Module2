package ss3_array_on_java.bai_tap;

import java.util.Scanner;

public class FindingMaximumOfArray2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<----------------------------------------input of 2D matrix-------------------------------------------------->");
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
        System.out.println("<----------------------------------------print 2D matrix-------------------------------------------------->");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                System.out.print(matrix[row][column] + " ");
            }
            System.out.println();
        }
        System.out.println("<----------------------------------------find maximum of 2D matrix-------------------------------------------------->");
        int max = matrix[0][0];
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (max < matrix[row][column]){
                    max = matrix[row][column];
                }
            }
        }
        System.out.print("the maximum alement is: "+max);
    }
}
