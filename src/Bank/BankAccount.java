package Bank;

public class BankAccount {
    private String navn;
    private double tilgængeligPenge;
    private int bankID;

    public BankAccount() {
    }

    public BankAccount(String navn, double tilgængeligPenge, int bankID) {
        this.navn = navn;
        this.tilgængeligPenge = tilgængeligPenge;
        this.bankID = bankID;
    }

    public int getBankID() {
        return bankID;
    }

    public double getTilgængeligPenge() {
        return tilgængeligPenge;
    }

    public void setTilgængeligPenge(double tilgængeligPenge) {
        this.tilgængeligPenge = tilgængeligPenge;
    }
}
