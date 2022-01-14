import java.util.Stack;

public class ReverseSentence {
    public static void ReverseSentence(String word){
        Stack<String> words = new Stack<>();
        String[] wordsArray = word.split(" ");
        String temp;
        for(String s: wordsArray){
            if(s.charAt(0)==s.toUpperCase().charAt(0)){
                words.push(s.toLowerCase()+".");
            }

            if(s.charAt(s.length()-1)!= '.'&& s.charAt(0)!=s.toUpperCase().charAt(0)){
                words.push(s);
            }
            if (s.charAt(s.length()-1)=='.'){
                temp=s.substring(0,s.length()-1);
                s=temp.substring(0,1).toUpperCase()+temp.substring(1);
                words.push(s);
                while(!words.empty()){
                    System.out.print(words.pop()+" ");
                }
            }
        }
    }
}
