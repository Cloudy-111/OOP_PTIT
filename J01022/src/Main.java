
import java.util.Scanner;

public class Main {
    public static long[] F = new long[94];
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt(); long k = sc.nextLong();
            Fibo();
            System.out.println(find(n,k));
        }
    }
    
    public static long find(int n, long k){
        if(n == 1)return 0;
        if(n == 2)return 1;
        if(k > F[n - 2])
            return find(n - 1, k - F[n - 2]);
        else return find(n - 2, k);
    }
    
    public static void Fibo(){
        F[0] = 0;
        F[1] = 1;
        for(int i = 2; i < 94; ++i)F[i] = F[i - 1] + F[i - 2];
    }
}
