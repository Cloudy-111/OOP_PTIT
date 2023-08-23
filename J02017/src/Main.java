
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer>s = new Stack<>();
        for(int i = 0; i < n; ++i){
            int x = sc.nextInt();
            int chk = 0;
            while(s.empty() == false && (s.peek() + x) % 2 == 0){s.pop(); chk = 1;}
            if(chk == 0)s.push(x);
        }
        System.out.print(s.size());
    }
    
}
