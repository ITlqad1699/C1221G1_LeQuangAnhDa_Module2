package ss19_regex_and_string.excercise;

import java.util.Scanner;

public class PhoneNumber {
    private static final String PHONE_NUMBER = "^\\([0-9]{2}\\)-\\(0\\d{9}\\)$";

    public static boolean testPhoneNumber(String phoneNumber) {
        return phoneNumber.matches(PHONE_NUMBER);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter class phone number: ");
        String phoneNumber = scanner.nextLine();
        if(testPhoneNumber(phoneNumber)){
            System.out.println(testPhoneNumber(phoneNumber));
        } else {
            System.out.println(testPhoneNumber(phoneNumber));
        }
    }
}
