package ss2_loop_on_java.bai_tap;

import java.util.Scanner;

public class PrimeNumbersExtension {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter number: ");
        int mark = 1;
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println("number is not primenumber");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    mark = 0;
                    break;
                }
            }
            if (mark == 1) {
                System.out.println("number is a primenumber");
            } else {
                System.out.println("number is not a primenumber");
            }
        }
        System.out.println("PrimeNumbers in range 2-100: ");
        boolean flag = true;
        for (int i = 2; i <= 100; i++) {
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            }
            flag = true;
        }
    }
}
