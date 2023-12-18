
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> stk1 = new Stack<>();
        Stack<Character> stk2 = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '<'){
                if(!stk2.isEmpty()){
                    char x = stk2.pop();
                    stk1.push(x);
                }
            }
            else if(s.charAt(i) == '>'){
                if(!stk1.isEmpty()){
                    char x = stk1.pop();
                    stk2.push(x);
                }
            }
            else if(s.charAt(i) == '-') {
                if(!stk2.isEmpty()) stk2.pop();
            }
            else stk2.push(s.charAt(i));
        }
        while(!stk2.isEmpty()){
            stk1.push(stk2.pop());
        }
        while(!stk1.isEmpty())System.out.print(stk1.pop());
        
    }
    
}
