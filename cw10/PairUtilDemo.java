public class PairUtilDemo {
    public static void main(String[] args){
        Pair<String,String> pair2 = new Pair<>("Pierwszy", "Drugi");
        System.out.println("Przed: " +pair2.getOb1()+ " " + pair2.getOb2());
        Pair<String,String> pair3 = PairUtil.swap(pair2);
        System.out.println("Po: " +pair3.getOb1()+ " "+ pair3.getOb2());
    }
}
