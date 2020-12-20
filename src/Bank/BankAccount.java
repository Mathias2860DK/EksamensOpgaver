package Bank;

import java.time.LocalDate;

public class BankAccount implements Comparable<BankAccount> {
    int saldo;
    String name;

    public BankAccount(int saldo, String name) {
        this.saldo = saldo;
        this.name = name;
    }
    public BankAccount (){

    }
    public int getSaldo(){
        return saldo;
    }

    public int insertMoney(int penge){
        int nySaldo = saldo + penge;

        return nySaldo;
    }

    public void indsætTilSaldo(int indtsætPenge) {

        this.saldo = saldo + indtsætPenge;
    }

    @Override
    public String toString(){
        return "name: " + name + " saldo: " + saldo + "\n";
    }


    @Override
    public int compareTo(BankAccount o) {
        return (this.saldo - o.getSaldo());
    }
}
