package cw5;

public class IntegerSet {
    private boolean[] tab;

    public IntegerSet(){
        tab = new boolean[100];
    }
    public static IntegerSet union(IntegerSet a, IntegerSet b) {
        IntegerSet c = new IntegerSet();
        for (int i = 0; i < 100; i++) {
            if (a.tab[i]) {
                c.tab[i] = true;
            }
            if (b.tab[i]) {
                c.tab[i] = true;
            }
        }
            return c;
        }
        public static IntegerSet intersection(IntegerSet a, IntegerSet b){
            IntegerSet c = new IntegerSet();
            for(int i =0; i< 100; i++){
                if(a.tab[i] && b.tab[i]){
                    c.tab[i] = true;
                }
            }
            return c;
        }
        public void insertElement(int a){
            this.tab[a] = true;
        }
        public void deleteElement(int a){
            this.tab[a] = false;
        }
        public String toString(){
            String s = "";
            for(int i =0; i<99; i++){
                if(tab[i]){
                    s+=(i+" ");
                }
                if(tab[99]){
                    s +=99;
                }
            }
            return s;
        }
        public boolean equals(Object a){
        if(this==a){
            return true;
        }
        IntegerSet b = (IntegerSet) a;
        for(int i=0; i< 100; i++){
            if(tab[i] !=b.tab[i]){
                return false;
            }
        }
        return true;
        }
        public static void main(String[] args){
        IntegerSet tab1 = new IntegerSet();
        IntegerSet tab2 = new IntegerSet();
        tab1.insertElement(11);
        tab1.insertElement(12);
        tab2.insertElement(12);
        tab2.insertElement(22);
        System.out.println(tab1);
        System.out.println(tab2);
        System.out.println(IntegerSet.union(tab1,tab2));
        System.out.println(IntegerSet.intersection(tab1,tab2));
        System.out.println(tab1.equals(tab2));
        tab1.deleteElement(11);
        tab2.deleteElement(22);
        System.out.println(tab1);
        System.out.println(tab2);
        System.out.println(IntegerSet.intersection(tab1,tab2).equals(tab2));
        }
    }

