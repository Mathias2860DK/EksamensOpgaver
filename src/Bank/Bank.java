package Bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bank {
 String name;
 BankAccount bankAccount = new BankAccount();
 List <BankAccount> bankAccounts = new ArrayList<BankAccount>();


 public Bank (String name){
     this.name = name;
 }


 public void addBankAccount(BankAccount bankAccount){
     bankAccounts.add(bankAccount);
 }


    @Override
    public String toString() {
         Collections.sort(bankAccounts);
        return "BankName='" + name + '\'' +
                ", bankAccounts=" + "\n " + bankAccounts ;
    }
}
