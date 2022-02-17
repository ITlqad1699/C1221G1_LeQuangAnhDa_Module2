package ss2_loop_on_java.bai_tap;

import java.util.Scanner;

public class DisplayingPrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.print("enter numbers: ");
        int numbers = scanner.nextInt();
//        The first way:
        System.out.println("PrimeNumbers in range: ");
        for (int i = 2; i <= numbers; i++) {
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    flag = false;
                }
            }
            if (flag) {
                System.out.println(i);
            }
            flag = true;
        }
    }
}
