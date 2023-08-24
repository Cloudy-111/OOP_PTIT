
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            String n = sc.nextLine();
            if(check(n) == true && sum(n) == true)System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static Boolean sum(String n){
        int res = 0;
        for(int i = 0; i < n.length(); ++i)
            res+=(n.charAt(i) - '0');
        return res % 10 == 0;
    }
    
    public static Boolean check(String n){
        int l = 0, r = n.length() - 1;
        if(n.charAt(l) != '8' || n.charAt(r) != '8')return false;
        while(l < r){
            if(n.charAt(l) != n.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
}
