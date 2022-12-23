package assignment11and12.ObjectOrientedPracticePrograms;

import java.util.Scanner;

public class AccountCheckBalance {

    double balance;

    public AccountCheckBalance(double balance) {

        this.balance = balance;
    }

    //debit method to check balance and debit amount

    public void debitMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount for debit :");
        int debitAmount = scanner.nextInt();
        if (debitAmount < balance) {
            balance -= debitAmount;
            System.out.println("Debit amount is : " + debitAmount);
            System.out.println("Account balance is : " + balance);
        } else {
            System.out.println("Debit Amount Is More Than Account Balance!..");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the account Balance : ");
        AccountCheckBalance account = new AccountCheckBalance(scanner.nextDouble());
        account.debitMethod();
    }
}