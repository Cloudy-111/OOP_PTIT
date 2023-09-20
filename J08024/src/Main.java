
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            int n = Integer.parseInt(sc.nextLine());
            System.out.println(solve(n));
        }
    }
    public static Long solve(int n){
        Deque<Long> q = new ArrayDeque<>();
        q.addLast(9L);
        while(q.getFirst()% n != 0){
            long tmp = q.removeFirst();
            q.addLast(tmp * 10L);
            q.addLast(tmp * 10L + 9L);
        }
        return q.getFirst();
    }
    
}
