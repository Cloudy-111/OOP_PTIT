
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            Stack<Character> st = new Stack<>();
            String s = sc.nextLine();
            for(int i = 0; i < s.length(); ++i){
                if(!st.isEmpty()){
                    if(s.charAt(i) == ')' && st.peek() == '(')st.pop();
                    else if(s.charAt(i) == ']' && st.peek() == '[')st.pop();
                    else if(s.charAt(i) == '}' && st.peek() == '{')st.pop();
                    else st.push(s.charAt(i));
                }
                else st.push(s.charAt(i));
            }
            if(st.isEmpty())System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
