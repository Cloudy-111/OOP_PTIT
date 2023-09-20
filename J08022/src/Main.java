
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            sc.nextLine();
            int n = Integer.parseInt(sc.nextLine());
            int[] a = new int[n + 1];
            for(int i = 1; i <= n; ++i)a[i] = sc.nextInt();
            Stack<Integer> st = new Stack<>();
            int[] b = new int[n + 1];
            for(int i = 1; i <= n; ++i){
                while(!st.isEmpty() && a[i] > a[st.peek()]){
                    b[st.peek()] = a[i];
                    st.pop();
                }
                st.push(i);
            }
            for(int i = 1; i <= n; ++i)
                if(b[i] == 0)System.out.print(-1 + " ");else System.out.print(b[i] + " ");
            System.out.println();
        }
    }
    
}
