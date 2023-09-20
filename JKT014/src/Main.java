
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            sc.nextLine();
            int n = sc.nextInt();
            sc.nextLine();
            int[] a = new int[n + 1];
            Stack<Integer> st = new Stack<>();
            st.push(0);
            for(int i = 1; i <= n ;++i){
                a[i] = sc.nextInt();
                while(st.size() > 1 && a[i] >= a[st.peek()]){
                    st.pop();
                }
                System.out.print(i - st.peek() + " ");
                st.push(i);
            }
            System.out.println();
        }
    }
    
}
