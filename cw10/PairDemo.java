public class PairDemo {
    public static void main(String[] args){
        Pair<String,String> pair = new Pair<>("Pierwszy", "Drugi");
        System.out.println("Przed: " +pair.getOb1()+ " " + pair.getOb2());
        pair.swap();
        System.out.println("Po: " +pair.getOb1()+ " "+ pair.getOb2());
    }
}
