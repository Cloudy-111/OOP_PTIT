
import java.util.Scanner;

public class Main {
    public static final long MOD = 1000000007; 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        while (true){
            long a = sc.nextLong(), b = sc.nextLong();
            if(a == 0 && b == 0)break;
            System.out.println(powMod(a,b));
        }
    }
    
    public static long powMod(long a, long b){
        if(b == 0)return 1;
        else{
            if(b % 2 == 0){
                return powMod(a * a % MOD, b / 2) % MOD;
            }
            else return a * powMod(a * a % MOD, b / 2) % MOD;
        }
    }
    
}
