package BankMedMarkus;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Danske Bank");
        BankAccount bankAccount = new BankAccount("Mathias",200);
        BankAccount bankAccount1 = new BankAccount("Markus",300);
        BankAccount bankAccount2 = new BankAccount("Jeppe",50);
        bank.addBankAccount(bankAccount);
        bank.addBankAccount(bankAccount1);
        bank.addBankAccount(bankAccount2);
        bank.printBankaccounts();
        System.out.println();
        bankAccount1.insertMoney(700,LocalDate.now().plusMonths(1));

        bank.printBankaccounts();
        bankAccount2.withdrawMoney(100); //Not enough money
List<BankAccount> listToSort = bank.getBankAccountList();
        System.out.println("flest penge: " + listToSort.get(listToSort.size() - 1));
        System.out.println("Færrest penge: " + listToSort.get(0));
        System.out.println("færrest penge:" + Collections.min(listToSort));
        System.out.println("færrest penge:" + Collections.max(listToSort));

    }
}
