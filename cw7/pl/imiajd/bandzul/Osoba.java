package pl.imiajd.bandzul;

public class Osoba{
    private String nazwisko;
    private int rokUrodzenia;

    public Osoba(String nazwisko, int rokUrodzenia){
        this.nazwisko= nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getNazwisko(){
        return nazwisko;
    }

    public int getRokUrodzenia(){
        return rokUrodzenia;
    }

    public String toString(){
        return "nazwisko: " + nazwisko +" ,rok urodzenia: "+ rokUrodzenia;
    }
}
