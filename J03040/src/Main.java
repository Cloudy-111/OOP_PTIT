
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            String n = sc.next();
            StringBuilder sb = new StringBuilder("");
            for(int i = 5; i <= 10; ++i)if(n.charAt(i) != '.')sb.append(n.charAt(i));
            if(check(sb.toString()) == true)System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static Boolean check(String s){
        if(s.charAt(0) < s.charAt(1) && s.charAt(1) < s.charAt(2) && s.charAt(2) < s.charAt(3) && s.charAt(3) < s.charAt(4))return true;
        if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(2) == s.charAt(3) && s.charAt(3) == s.charAt(4))return true;
        if(s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(3) == s.charAt(4))return true;
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) != '6' && s.charAt(i) != '8')return false;
        }
        return true;
    }
    
}
