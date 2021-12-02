package pl.imiajd.bandzul;

public class Adres {
    private String ulica;
    private int numer_domu;
    private int numer_mieszkania;
    private String miasto;
    private String kod_pocztowy;

    public Adres(String ulica, int numer_domu, int numer_mieszkania, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.numer_mieszkania = numer_mieszkania;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }
    public Adres(String ulica, int numer_domu, String miasto, String kod_pocztowy){
        this.ulica = ulica;
        this.numer_domu = numer_domu;
        this.miasto = miasto;
        this.kod_pocztowy = kod_pocztowy;
    }
    public void pokaz(){
        System.out.println("kod pocztowy: "+ kod_pocztowy + " ,miasto: "+ miasto);
        System.out.println("ulica: "+ ulica+ " ,numer domu: "+ numer_domu+ " ,numer mieszkania: "+numer_mieszkania +"\n");
    }
    public boolean przed(Adres adr){
        int adr1 = Integer.parseInt(adr.kod_pocztowy.substring(0,1)) + Integer.parseInt(adr.kod_pocztowy.substring(3));
        int adr2 = Integer.parseInt(this.kod_pocztowy.substring(0,1)) + Integer.parseInt(this.kod_pocztowy.substring(3));
        return adr1>adr2;
    }
}
