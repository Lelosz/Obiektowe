package z2;

import java.util.*;

public class printMarginal {
    public static<T,E extends Iterable<T>> void printMarginal(E obj){
        Iterator<T> iter2 = obj.iterator();
        var ost = iter2.next();
        Iterator<T> iter = obj.iterator();
        if(iter.hasNext()) System.out.println("Element z lewej:" + iter.next());
        while(iter.hasNext()){
            ost = iter.next();
        }
        System.out.println("Element z prawej: " + ost);
    }
    public static void main(String[] args){
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        List<Double> list2 = new ArrayList<>();
        list2.add(1.5);
        list2.add(2.1);
        list2.add(3.3);
        list2.add(4.4);
        list2.add(5.5);
        List<String> list3 = new ArrayList<>();
        list3.add("raz");
        list3.add("dwa");
        list3.add("trzy");
        list3.add("cztery");
        list3.add("piec");
        ArrayDeque<Integer> list4 = new ArrayDeque<>();
        list4.add(1);
        list4.add(56);
        list4.add(33);
        list4.add(333);
        list4.add(111);
        LinkedList<String> list5 = new LinkedList<>();
        list5.add("aaa");
        list5.add("bbb");
        list5.add("ccc");
        list5.add("ddd");
        
        printMarginal(list1);
        printMarginal(list2);
        printMarginal(list3);
        printMarginal(list4);
        printMarginal(list5);

    }
}

