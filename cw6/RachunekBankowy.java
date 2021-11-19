package cw5;

public class RachunekBankowy {
    public static double rocznaStopaProcentowa;
    private double saldo;

    public RachunekBankowy(double saldo){
        this.saldo = saldo;
    }

    public void obliczMiesieczneOdsetki(){
        double miesOds = (this.saldo* rocznaStopaProcentowa)/12;
        saldo += miesOds;
    }

    public static void setRocznaStopaProcentowa(double wartosc){
        rocznaStopaProcentowa = wartosc;
    }
    public double getSaldo(){
        return saldo;
    }
}
