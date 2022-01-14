import java.util.LinkedList;

public class ReverseTest {
    public static void main(String[] args){
        LinkedList<String> lista = new LinkedList<>();
        lista.add("1");
        lista.add("2");
        lista.add("3");
        lista.add("4");
        lista.add("5");
        lista.add("6");
        lista.add("7");
        lista.add("8");
        lista.add("9");
        lista.add("10");
        System.out.println("Pierwszy element: "+lista.peekFirst());
        System.out.println("Ostatni element: "+lista.peekLast()+"\n");
        Reverse.odwroc(lista);
        System.out.println("Pierwszy element: "+lista.peekFirst());
        System.out.println("Ostatni element: "+lista.peekLast()+"\n");

    }
}
