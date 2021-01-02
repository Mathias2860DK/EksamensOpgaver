package Bank2;

public class BankAccount implements Comparable <BankAccount> {
    String name;
    double saldo;

    public BankAccount(String name, double saldo){
        this.saldo = saldo;
        this.name = name;
    }


    public void indsætPenge(double pengeTilIndsættelse){
        saldo = saldo + pengeTilIndsættelse;
    }
    public void hævPenge(double pengeAtHæve){

        try {
            if (pengeAtHæve > saldo){
                throw new IkkeNokPengeExeption("Du har ikke nok penge");
            } else {
                saldo = saldo - pengeAtHæve;
            }
        } catch (IkkeNokPengeExeption exeption){
            System.out.println(exeption + "Du har ikke nok penge");
        }
        }
public double getSaldo(){
        return saldo;
}


    public String toString(){
        return name + ", saldo: " + saldo + "\n";
    }

    @Override
    public int compareTo(BankAccount o) {
        return (int) this.saldo - (int) o.getSaldo();
    }
}
