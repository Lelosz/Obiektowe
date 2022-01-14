import java.util.ArrayList;

public class Print<T> {
    ArrayList<T> ob;

    Print(ArrayList<T> ob){
        this.ob = ob;
    }

    public static <T, V extends Iterable<T>> void print(V iterable) {
        ArrayList<String> strlist = new ArrayList<>();
        for(T element: iterable) {
            strlist.add(element.toString());
        }
        String result = String.join(", ", strlist);
        System.out.println(result);
    }

}
