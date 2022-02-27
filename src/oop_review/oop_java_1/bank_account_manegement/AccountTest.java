package oop_review.oop_java_1.bank_account_manegement;

import java.util.Scanner;

public class AccountTest extends Account {
    Scanner scanner = new Scanner(System.in);
    private static Account[] accounts = new Account[100];

    static {
        accounts[0] = new Account(121344, "John", 500);
        accounts[1] = new Account(1112312, "max", 1000);
        accounts[2] = new Account(3333, "ben", 1000);
        accounts[3] = new Account(1112, "tom", 700);
        accounts[4] = new Account(11123, "peter", 150);
    }

    public static void main(String[] args) {
        System.out.print(accounts[0]);
        accounts[0].depositMoney();
        System.out.print(accounts[0]);
    }
}
