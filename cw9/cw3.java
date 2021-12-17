import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class cw3 {
    public static void main(String[] args) throws  FileNotFoundException{
        ArrayList<String> togetsorted = new ArrayList<>();
        Scanner s = new Scanner(new File("src\\plik.txt"));
        while(s.hasNextLine()){
            togetsorted.add(s.nextLine());
        }
        s.close();

        for(String el: togetsorted){
            System.out.println(el);
        }

        togetsorted.sort(String::compareTo);
        System.out.println("\npo sortowaniu:\n");

        for(String el: togetsorted){
            System.out.println(el);
        }
    }
}
