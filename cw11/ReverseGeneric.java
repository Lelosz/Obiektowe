import java.util.LinkedList;
public class ReverseGeneric<T> {
    LinkedList<T> ob;

     ReverseGeneric(LinkedList<T> ob){
         this.ob = ob;
    }

    public void odwroc(LinkedList<T> ob){
        LinkedList<T> temp = new LinkedList<>();
        for(int i=ob.size(); i>0;i--){
            temp.addFirst(ob.remove());
        }
        for(int j=temp.size(); j>0;j--){
            ob.addLast(temp.poll());
        }
    }
}
