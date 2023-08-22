import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        if(check(n) == true)System.out.println("YES");
        else System.out.println("NO");
    }
    
    public static Boolean check(String n){
        StringBuilder sb = new StringBuilder(n);
        int t1 = 0, t2 = 0;
        for(int i = 0; i < n.length(); ++i){
            if(sb.charAt(i) == '4')t1++;
            if(sb.charAt(i) == '7')t2++;
        }
        int res = t1 + t2;
        return res == 4 || res == 7;
    }
    
}
