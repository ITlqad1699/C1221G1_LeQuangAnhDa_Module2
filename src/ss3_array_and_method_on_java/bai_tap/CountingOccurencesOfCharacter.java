package ss3_array_and_method_on_java.bai_tap;

import java.util.Scanner;

public class CountingOccurencesOfCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("<----------------------------------------Intialize A String And Character-------------------------------------------------->\n");
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter a character: ");
        //syntax of declaration a character:
        char charactor = scanner.next().charAt(0);
        System.out.print("<----------------------------------------Count Occurrences Of Character-------------------------------------------------->\n");
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (charactor == str.charAt(i)) {
                count += 1;
            }
        }
        System.out.print("the character " + charactor + " is appear " + count + " times");
    }
}