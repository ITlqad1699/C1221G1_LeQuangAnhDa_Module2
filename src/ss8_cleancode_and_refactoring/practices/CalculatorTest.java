package ss8_cleancode_and_refactoring.practices;

import java.util.Scanner;

public class CalculatorTest extends Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first operand: ");
        int firstOperand = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter first operand: ");
        int secondOperand = Integer.parseInt(scanner.nextLine());
        System.out.print(calculate(firstOperand, secondOperand, '+'));
    }
}
