
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            String s = sc.next();
            if(check(s) == true)System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static Boolean check(String s){
        int l = 0, r = s.length() - 1;
        int cnt = 0;
        while(l < r){
            if(s.charAt(l) != s.charAt(r))cnt++;
            l++;
            r--;
        }
        if(s.length() % 2 == 0 && cnt == 1)return true;
        else if(s.length() % 2 == 1 && cnt <= 1)return true;
        return false;
    }
}
