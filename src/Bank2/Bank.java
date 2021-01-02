package Bank2;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    List <BankAccount> bankAccountList = new ArrayList<>();
    String name;
public Bank (String name){
    this.name = name;
}

public void addBankAccount (BankAccount bankAccount){
    bankAccountList.add(bankAccount);
}

public void printBankAccountList(){
    for (BankAccount bankAccount : bankAccountList) {
        System.out.println(bankAccount);
    }
}

public List <BankAccount> getBankAccountList(){
    return bankAccountList;
}

public String toString(){
    return "BankName: " + name + "\n" +bankAccountList;
}
}
