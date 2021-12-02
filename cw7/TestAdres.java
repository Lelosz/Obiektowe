import pl.imiajd.bandzul.Adres;

public class TestAdres {
    public static void main(String[] args){
        Adres ad1 = new Adres("Pochmurna", 1,1, "Gdynia","11-111");
        Adres ad2 = new Adres("Pogodna", 2, "Gdansk","22-222");
        ad1.pokaz();
        ad2.pokaz();
        System.out.println(ad2.przed(ad1));
    }
}
