package Bank;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

BankAccount bankAccount = new BankAccount(100000,"Mathias");
BankAccount bankAccount1 = new BankAccount(2000,"Jens");
BankAccount bankAccount2 = new BankAccount(30000,"Peter");

        Bank bank = new Bank("Danske Bank");
        bank.addBankAccount(bankAccount);
        bank.addBankAccount(bankAccount1);
        bank.addBankAccount(bankAccount2);
        System.out.println("Banken uden der er blevet tilført penge: " + "\n" + bank);
        bankAccount.indsætTilSaldo(100);
        System.out.println("Banken efter Mathias har sat 100kr ind: " + "\n" +  bank);
        //bankAccount2.indsætTilSaldo(3000);
        System.out.println(bank);
            System.out.println("sorted by saldo: ");
        LocalDate date1 = LocalDate.of(2021, 01, 13);
        bankAccount.indsætTilSaldoSenere(300,date1);
        System.out.println(bankAccount);

    }
}
