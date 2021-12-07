package pl.imiajd.bandzul;


public abstract class Osoba
{
    private String nazwisko;
    private String[] imiona;
    private java.time.LocalDate dataUrodzenia;
    private boolean plec;

    public Osoba(String nazwisko,String[] imiona, java.time.LocalDate dataUrodzenia, boolean plec)
    {
        this.nazwisko = nazwisko;
        this.imiona = imiona;
        this.dataUrodzenia = dataUrodzenia;
        this.plec = plec;

    }

    public String getNazwisko()
    {
        return nazwisko;
    }

    public String[] getImiona(){
        return imiona;
    }

    public java.time.LocalDate getDataUrodzenia(){
        return dataUrodzenia;
    }

    public boolean getPlec(){
        return plec;
    }

    public abstract String getOpis();
}