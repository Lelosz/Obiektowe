package cw5;

public class testRachunekBankowy {
    public static void main(String[] args){
        RachunekBankowy saver1 = new RachunekBankowy(2000);
        RachunekBankowy saver2 = new RachunekBankowy(3000);
        RachunekBankowy.setRocznaStopaProcentowa(0.04);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println("Nowy stan oszczednosci dla rachunku nr1: "+ saver1.getSaldo());
        System.out.println("Nowy stan oszczednosci dla rachunku nr2: "+ saver2.getSaldo());
        RachunekBankowy.setRocznaStopaProcentowa(0.05);
        saver1.obliczMiesieczneOdsetki();
        saver2.obliczMiesieczneOdsetki();
        System.out.println("Nowy stan oszczednosci dla rachunku nr1 po kolejnym miesiacu: "+ saver1.getSaldo());
        System.out.println("Nowy stan oszczednosci dla rachunku nr2 po kolejnym miesiacu: "+ saver2.getSaldo());
    }
}
