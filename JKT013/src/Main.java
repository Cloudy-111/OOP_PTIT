
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            int n = Integer.parseInt(sc.nextLine());
            solve(n);
        }
    }
    public static void solve(int n){
        ArrayList<String> lst = new ArrayList<>();
        
        Deque<String> dq = new ArrayDeque<>();
        dq.addLast("6");
        dq.addLast("8");
        
        while(dq.getFirst().length() < n + 1){
            String tmp = dq.removeFirst();
            lst.add(tmp);
            dq.addLast(tmp + "6");
            dq.addLast(tmp + "8");
        }
        System.out.println(lst.size());
        for(int i = lst.size() - 1; i >= 0; --i)System.out.print(lst.get(i) + " ");
        System.out.println();
    }
    
}
