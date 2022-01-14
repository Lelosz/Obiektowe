import java.util.ArrayList;

public class PrintTest {
    public static void main(String[] args){
        ArrayList<Integer> intli = new ArrayList<>();
        intli.add(1);
        intli.add(2);
        intli.add(3);
        intli.add(4);
        ArrayList<String> strli = new ArrayList<>();
        strli.add("Jeden");
        strli.add("Dwa");
        strli.add("Trzy");
        strli.add("Cztery");
        Print obj = new Print(intli);
        obj.print(intli);
        Print obj2 = new Print(strli);
        obj2.print(strli);

    }
}
