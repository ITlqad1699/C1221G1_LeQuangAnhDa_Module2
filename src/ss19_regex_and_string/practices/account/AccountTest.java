package ss19_regex_and_string.practices.account;

import java.util.Scanner;

public class AccountTest {
    public static final String[] validAccount = new String[]{"123abc_", "_abc123", "______", "123456", "abcdefgh"};
    public static final String[] invalidAccount = new String[]{".@", "12345", "1234_", "abcde"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your account's number: ");
        int accountNum = Integer.parseInt(scanner.nextLine());
        String account = Integer.toString(accountNum);
        if (ValidateAccount.validdateAccount(account)) {
            System.out.println("Okay");
        } else {
            System.out.println("Not Okay");
        }
    }
}
