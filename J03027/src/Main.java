
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        Stack<Character>s = new Stack<>();
        for(int i = 0; i < n.length(); ++i){
            int chk = 0;
            if(!s.empty() && n.charAt(i) == s.peek()){s.pop(); chk = 1;}
            if(chk == 0)s.push(n.charAt(i));
        }
        if(!s.empty()){
            StringBuilder sb = new StringBuilder();
            while(!s.empty()){
                sb.insert(0, s.peek());
                s.pop();
            }
            System.out.println(sb.toString());
        }
        else System.out.println("Empty String");
    }
    
}
