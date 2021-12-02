package pl.imiajd.bandzul;

public class Nauczyciel extends Osoba{
    private double pensja;
    public Nauczyciel(String nazwisko, int dataUrodzenia, double pensja){
        super(nazwisko,dataUrodzenia);
        this.pensja = pensja;
    }
    public double getPensja(){
        return pensja;
    }

    public String toString(){
        return "Opis nauczyciela: "+ super.toString() + " ,pensja: "+ pensja;
    }
}
