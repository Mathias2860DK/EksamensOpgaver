package Bank2;

import java.util.Collections;
import java.util.List;

public class Main {
    /*
    Bankopgave igen. 30 min forberredlse
     */
    public static void main(String[] args) {
        Bank bank = new Bank("Danske Bank");
        BankAccount bankAccount1 = new BankAccount("Thor",2000);
        BankAccount bankAccount = new BankAccount("Mathias",1000);

        bank.addBankAccount(bankAccount1);
        bank.addBankAccount(bankAccount);
        System.out.println("inden der er blevet hævet/indsat penge i banken: " + bank);
        List <BankAccount> sortedList = bank.getBankAccountList();
        Collections.sort(sortedList);


        System.out.println("Efter listen er sorteret: Så dem med færrest penge står først i den udprinttede liste:"
                + bank);
        bankAccount.hævPenge(500);
        System.out.println("efter mathias har hævet 500kr" + bank);
        bankAccount1.indsætPenge(500);
        System.out.println("Efter thor har insat 500kr " + bank);
        //bank.printBankAccountList(); Hvis det skal blive skrevet flottere op.
        bankAccount.hævPenge(1000);
        System.out.println(bank);


    }
}
