package pl.imiajd.bandzul;

import java.time.LocalDate;

public abstract class Instrument{
    private String producent;
    private java.time.LocalDate rokProdukcji;
    public Instrument(String producent, java.time.LocalDate rokProdukcji){
        this.producent = producent;
        this.rokProdukcji = rokProdukcji;
    }
    public String getProducent(){
        return producent;
    }
    public java.time.LocalDate getRokProdukcji(){
        return rokProdukcji;
    }
    public abstract String dzwiek();
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (!(o instanceof Instrument)){
            return false;
        }
        Instrument i = (Instrument) o;
        return producent.equals(i.producent) && rokProdukcji.equals(i.rokProdukcji);
    }
    public String toString(){
        return "Producent: "+ producent + " rok produkcji: "+ rokProdukcji + " "+ dzwiek();
    }
}