
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            long n = sc.nextLong();
            if(check(n) == true)System.out.println("YES");
            else System.out.println("NO");
        }
        
    }
    
    public static Boolean check(long n){
        long tmp = n % 10;
        n /= 10;
        long res = tmp;
        while(n > 1){
            long b = n % 10;
            if(Math.abs(b - tmp) != 2)return false;
            tmp = b;
            res += b;
            n /= 10;
        }
        return res % 10 == 0;
    }
    
}
