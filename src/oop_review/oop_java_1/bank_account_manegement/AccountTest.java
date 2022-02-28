package oop_review.oop_java_1.bank_account_manegement;

import java.util.Scanner;

public class AccountTest extends Account {
    private static Account[] accounts = new Account[100];

    static {
        accounts[0] = new Account(121344, "John", 500);
        accounts[1] = new Account(1112312, "max", 1000);
        accounts[2] = new Account(3333, "ben", 1000);
        accounts[3] = new Account(1112, "tom", 700);
        accounts[4] = new Account(11123, "peter", 150);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("<--------------------depisit money into accounts[0]----------------------> ");
        System.out.print(accounts[0]);
        accounts[0].depositMoney();
        System.out.print(accounts[0]);
        System.out.println("<--------------------take money from accounts[0]----------------------> ");
        accounts[0].takeMoney();
        System.out.print(accounts[0]);
        System.out.println("<--------------------maturity money on accounts[0]----------------------> ");
        accounts[0].maturMoney();
        System.out.print(accounts[0]);
        long numberFinding;
        System.out.println("<---------------transfer money from accounts[0] to another account----------------------> ");
        System.out.println("Enter receiver account number : ");
        numberFinding = Integer.parseInt(scanner.nextLine());
        accounts[0].transferMoney(accounts, numberFinding);
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getNumberAccount() == numberFinding || numberFinding != accounts[0].getNumberAccount()) {
                System.out.println(accounts[i].getMoneyOnAccount());
                break;
            } else {
                System.out.println("wrong account number! ");
            }
        }
        System.out.println(accounts[0].getMoneyOnAccount());
    }
}
