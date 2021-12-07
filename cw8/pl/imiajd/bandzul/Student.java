package pl.imiajd.bandzul;

public class Student extends Osoba
{
    private String kierunek;
    private double sredniaOcen;

    public Student(String nazwisko,String[] imiona, java.time.LocalDate dataUrodzenia,boolean plec, String kierunek,double sredniaOcen)
    {
        super(nazwisko,imiona,dataUrodzenia,plec);
        this.kierunek = kierunek;
        this.sredniaOcen = sredniaOcen;
    }
    public double getSredniaOcen(){
        return sredniaOcen;
    }
    public void setSredniaOcen(double sredniaOcen){
        this.sredniaOcen = sredniaOcen;
    }

    public String getOpis()
    {
        return " kierunek studiów: " + kierunek + " ,srednia ocen: "+ sredniaOcen;
    }
}