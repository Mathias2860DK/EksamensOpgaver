package BankMedMarkus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bank {
    List <BankAccount> bankAccounts = new ArrayList<>();
String name;
    public Bank (String name){
        this.name = name;
    }

    public void addBankAccount(BankAccount bankAccount){
        bankAccounts.add(bankAccount);
    }

    public void printBankaccounts(){
        Collections.sort(bankAccounts);
        for (BankAccount bankAccount: bankAccounts) {
            System.out.println(bankAccount);
        }
    }
    public List <BankAccount> getBankAccountList (){
        return bankAccounts;
    }
}
