import java.util.LinkedList;
public class Reverse {
    public static void odwroc(LinkedList<String> lista){
        LinkedList<String> temp = new LinkedList<>();
        for(int i=lista.size(); i>0;i--){
            temp.addFirst(lista.remove());
        }
        for(int j=temp.size(); j>0;j--){
            lista.addLast(temp.poll());
        }
    }
}
