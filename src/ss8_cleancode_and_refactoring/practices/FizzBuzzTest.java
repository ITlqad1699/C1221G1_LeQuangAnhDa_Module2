package ss8_cleancode_and_refactoring.practices;

import java.util.Scanner;

public class FizzBuzzTest extends FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.print(fizzBuzz(number));
    }
}
