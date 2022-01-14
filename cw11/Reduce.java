import java.util.LinkedList;

public class Reduce<T> {

    LinkedList<T> ob;

    public Reduce(LinkedList<T> ob){
        this.ob = ob;
    }

    public void redukuj(LinkedList<T> ob, int n){
        for(int i=0;i<ob.size();i++){
            if(n==0){
                ob.remove(i);
                i=i-1;
            }
            if(n!=0){
                if(i%n==0){
                    ob.remove(i);
                }
            }
        }
    }
}
