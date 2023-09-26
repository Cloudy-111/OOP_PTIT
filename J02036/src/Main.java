
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < n; ++i)a[i] = sc.nextInt();
            int[] b = new int[n + 1];
            b[0] = a[0];
            b[n] = a[n - 1];
            for(int i = 1; i < n; ++i)b[i] = (a[i] * a[i - 1]) / gcd(a[i], a[i - 1]);
            for(int i = 0; i <= n; ++i)System.out.print(b[i] + " ");
            System.out.println();
        }
    }
    public static int gcd(int a, int b){
        if(b == 0)return a;
        return gcd(b, a % b);
    }
    
}
