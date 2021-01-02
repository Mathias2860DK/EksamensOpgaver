package BankMedMarkus;


import java.time.LocalDate;

public class BankAccount implements Comparable <BankAccount> {
    String name;
    double saldo;

    public BankAccount (String name, double saldo){
        this.name = name;
        this.saldo = saldo;
    }


    public void insertMoney(double moneyToInsert, LocalDate localDate){
        LocalDate now = LocalDate.now();
        if (localDate.isAfter(now.plusMonths(1).minusDays(1))){
            saldo = (saldo + moneyToInsert)*1.10;
        } else {
            saldo = saldo + moneyToInsert;
        }

    }

    public void withdrawMoney (double moneyToWithdraw){
        try {
            if (saldo > moneyToWithdraw){
                saldo = saldo - moneyToWithdraw;
            } else if (saldo < moneyToWithdraw) {
                throw new IkkeNokPengeExeption("Not enough money for withdrawl");
            }
        } catch (IkkeNokPengeExeption e){
            System.out.println("Not enough money for withdrawl");
        }


    }

    @Override
    public int compareTo(BankAccount o) {
        return Double.compare(this.saldo,o.saldo);
    }

    public String toString(){
        return name + ", saldo: " + saldo + " DKK";
    }

}
