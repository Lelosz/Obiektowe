import java.util.Stack;

public class SpacedNumbers {
    public static void spacedNumbers(int number){
        Stack<Integer> words = new Stack<>();
        while(number>0){
            int remainder = number%10;
            words.push(remainder);
            number=number/10;
        }
        while(!words.empty()){
            System.out.print(words.pop()+" ");
        }
    }
}
