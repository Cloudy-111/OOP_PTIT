
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            int res = 0;
            String s = sc.nextLine();
            Stack<Integer> st = new Stack<>();
            st.push(-1);
            for(int i = 0; i < s.length(); ++i){
                if(s.charAt(i) == '(')st.push(i);
                else{
                    st.pop();
                    if(!st.isEmpty())res = Math.max(res, i - st.peek());
                    else st.push(i);
                }
            }
            System.out.println(res);
        }
    }
    
}
