
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(solve(n));
    }
    public static String solve(String a){
        StringBuilder res = new StringBuilder("");
        Character x = 'A';
        for(int i = a.length() - 1; i >= 0; --i){
            if(x <= a.charAt(i))x = a.charAt(i);
            if(a.charAt(i) == x)res.insert(0, x);
        }
        return res.toString();
    }
}
