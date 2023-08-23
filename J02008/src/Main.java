
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        //System.out.println(t);
        while(t-- != 0){
            int n = sc.nextInt();
            System.out.println(LCM(n));
        }
    }
    public static long LCM(int n){
        long res = 1;
        for(int i = 1; i <= n; ++i){
            res = lcm(res, i);
        }
        return res;
    }
    public static long lcm(long a,long b){
        return (a*b)/GCD(a, b);
    }
    public static long GCD(long a, long b){
        while(b != 0)
            return GCD(b, a % b);
        return a;
    }
    
}
