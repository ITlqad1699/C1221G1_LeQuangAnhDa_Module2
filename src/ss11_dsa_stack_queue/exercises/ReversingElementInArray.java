package ss11_dsa_stack_queue.exercises;

import java.lang.String;
import java.util.Arrays;
import java.util.Stack;

public class ReversingElementInArray {
    public static void main(String[] args) {
        int[] arrayNum = {1, 2, 3, 4, 5};
        System.out.println("Integer Array Before Reverse:");
        System.out.println(Arrays.toString(arrayNum));
        System.out.println("Integer Array After Reverse:");
        System.out.println(reverseElement(arrayNum));
        System.out.println("String before and after reverse: ");
        String strings = "abcdef";
        System.out.println(reverseString(strings));
    }

    public static Stack<Integer> reverseElement(int[] elements) {
        Stack<Integer> stack = new Stack<>();
        for (int i = elements.length - 1; i > -1; i--) {
            stack.push(elements[i]);
        }
        return stack;
    }

    public static String reverseString(String str) {
        Stack<Character> stringStack = new Stack<>();
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            stringStack.push(str.charAt(i));
        }
        for (int j = 0; j < str.length(); j++) {
            newStr += stringStack.pop();
        }
        return newStr;
    }
}
