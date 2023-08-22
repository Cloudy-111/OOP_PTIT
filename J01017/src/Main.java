
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            String n = sc.next();
            if(check(n) == true)System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static Boolean check(String n){
        for(int i = 0; i < n.length() - 1; ++i){
            if(Math.abs(n.charAt(i) - n.charAt(i + 1)) != 1)return false;
        }
        return true;
    }
    
}
