import java.util.ArrayList;
import java.util.Collections;


public class cw5 {

    public static void main(String... args) {

        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);


        ArrayList<Integer> b = new ArrayList<>();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        System.out.println(append(a,b));
        System.out.println(merge(a,b));
        System.out.println(mergeSorted(a,b));
        System.out.println(reversed(a));
        reverse(a);
        System.out.println(a);
    }

    public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> temp = a;

        temp.addAll(b);

        return temp;
    }

    public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> temp = new ArrayList<>();
        if(a.size()>b.size()){
            for(int i=0;i<b.size();i++){
                temp.add(a.get(i));
                temp.add(b.get(i));
            }
            for(int i=b.size();i<a.size();i++){
                temp.add(a.get(i));
            }
        }
        else{
            for(int i=0;i<a.size();i++){
                temp.add(a.get(i));
                temp.add(b.get(i));
            }
            for(int i=a.size();i<b.size();i++){
                temp.add(b.get(i));
            }
        }
        return temp;
    }

    public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b){
        ArrayList<Integer> temp = new ArrayList<>();
        temp.addAll(a);
        temp.addAll(b);
        Collections.sort(temp);
        return temp;
    }

    public static ArrayList<Integer> reversed(ArrayList<Integer> a){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=a.size()-1;i>=0;i--){
            temp.add(a.get(i));
        }
        return temp;
    }

    public static void reverse(ArrayList<Integer> a){
        ArrayList<Integer> temp = a;
        int pos =0;
        for(int i=a.size()-1;i>=0;i--){
            a.set(pos,temp.get(i));
            pos++;
        }
    }
}