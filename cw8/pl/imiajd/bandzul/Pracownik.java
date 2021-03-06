package pl.imiajd.bandzul;


public class Pracownik extends Osoba
{
    private double pobory;
    private java.time.LocalDate dataZatrudnienia;

    public Pracownik(String nazwisko,String[] imiona, java.time.LocalDate dataUrodzenia,boolean plec ,double pobory, java.time.LocalDate dataZatrudnienia)
    {
        super(nazwisko,imiona,dataUrodzenia,plec);
        this.pobory = pobory;
        this.dataZatrudnienia = dataZatrudnienia;
    }

    public double getPobory()
    {
        return pobory;
    }
    public java.time.LocalDate getDataZatrudnienia(){
        return dataZatrudnienia;
    }

    public String getOpis()
    {
        return " pensja: "+ pobory + " ,data zatrudnienia: "+ dataZatrudnienia;
    }
}