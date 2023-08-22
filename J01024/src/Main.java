
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            String s = sc.next();
            if(check(s))System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static Boolean check(String s){
        for(int i = 0; i < s.length(); ++i)
            if(s.charAt(i) != '0' && s.charAt(i) != '1' && s.charAt(i) != '2')return false;
        return true;
    }
    
}
