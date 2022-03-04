package ss11_dsa_stack_queue.exercises;

import java.util.Scanner;
import java.util.Stack;

public class TransferingDecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number: ");
        int decimal = Integer.parseInt(scanner.nextLine());
        System.out.println(decimalToBinary(decimal));
        System.out.println(binaryToDecimal(decimalToBinary(decimal)));
    }

    static String decimalToBinary(int decimal) {
        Stack<Integer> stack = new Stack<>();
        StringBuilder binary = new StringBuilder();
        while (decimal > 0) {
            stack.push(decimal % 2);
            decimal = decimal / 2;
        }
        int length = stack.size();
        for (int i = 0; i < length; i++) {
            binary.append(stack.pop());
        }
        return binary.toString();
    }

    static int binaryToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            decimal += Integer.parseInt(String.valueOf(binary.charAt(i)))*(Math.pow(2,i));
        }
        return decimal;
    }
}
