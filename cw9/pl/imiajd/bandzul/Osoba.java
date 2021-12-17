package pl.imiajd.bandzul;
import java.time.LocalDate;
import java.util.Objects;

public class Osoba implements Cloneable, Comparable<Osoba>{
    private String nazwisko;
    private LocalDate dataUrodzenia;

    public Osoba(String nazwisko, LocalDate dataUrodzenia){
        this.nazwisko = nazwisko;
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString(){
        return "Osoba" + " ["+ this.nazwisko +"] ["+ this.dataUrodzenia + "]";
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null|| getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(nazwisko, osoba.nazwisko) && Objects.equals(dataUrodzenia, osoba.dataUrodzenia);
    }

    public int compareTo(Osoba o) {
        if(this.nazwisko.equals(o.nazwisko)){
            return this.dataUrodzenia.compareTo(o.dataUrodzenia);
        }
        else{
            return this.nazwisko.compareTo(o.nazwisko);
        }
    }
    public String getNazwisko()
    {
        return nazwisko;
    }

    public LocalDate getDataUrodzenia()
    {
        return dataUrodzenia;
    }
}
