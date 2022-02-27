package oop_review.oop_java_1.bank_account_manegement;

import java.util.Scanner;

public class Account {
    Scanner scanner = new Scanner(System.in);
    private long numberAccount;
    private String name;
    private double moneyOnAccount;
    private final double InterestRateFactor = 0.035;
    private final double Fee = 2;

    Account() {
    }

    Account(String name, double moneyOnAccount) {
        this.moneyOnAccount = moneyOnAccount;
        this.name = name;
    }

    public Account(long numberAccount, String name, double moneyOnAccount) {
        this.numberAccount = numberAccount;
        this.name = name;
        this.moneyOnAccount = moneyOnAccount;
    }

    public long getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(long numberAccount) {
        this.numberAccount = numberAccount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoneyOnAccount() {
        return moneyOnAccount;
    }

    public void setMoneyOnAccount(double moneyOnAccount) {
        this.moneyOnAccount = moneyOnAccount;
    }

    public double depositMoney() {
        double money;
        do {
            System.out.println("Enter money that you want to deposit: ");
            money = Integer.parseInt(scanner.nextLine());
        }
        while (money < 0);
        this.setMoneyOnAccount(money + getMoneyOnAccount());
        return this.getMoneyOnAccount();
    }

    public double takeMoney() {
        double takingMoney;
        do {
            System.out.println("Enter money that you want to take: ");
            takingMoney = Integer.parseInt(scanner.nextLine());
        } while ((takingMoney < 0) || (this.getMoneyOnAccount() < (takingMoney + Fee)));
        this.setMoneyOnAccount(this.getMoneyOnAccount() - Fee - takingMoney);
        return this.getMoneyOnAccount();
    }

    public double maturMoney() {
        this.setMoneyOnAccount(this.getMoneyOnAccount() + this.getMoneyOnAccount() * InterestRateFactor);
        return this.getMoneyOnAccount();
    }

    public void transferMoney(Account[] accounts, long numberFinding) {
        double transferingMoney;
        do {
            System.out.print("Enter money that you want to transfer: ");
            transferingMoney = Double.parseDouble(scanner.nextLine());
        }
        while ((transferingMoney < 0) || (this.getMoneyOnAccount() < transferingMoney));
        for (int i = 0; i < accounts.length; i++) {
            if ((accounts[i].getNumberAccount() == numberFinding) && (accounts[i] instanceof Account)) {
                this.setMoneyOnAccount(this.getMoneyOnAccount() - transferingMoney);
                accounts[i].setMoneyOnAccount(accounts[i].getMoneyOnAccount() + transferingMoney);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Account name: " + this.name +
                "\naccount number: " + this.numberAccount +
                "\nMoney on your account: " + this.moneyOnAccount + "$\n";
    }
}
