
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            Integer[] a = new Integer[n];
            for(int i = 0; i < n; ++i)a[i] = sc.nextInt();
            Arrays.sort(a);
            int[] cb = new int[n + 1];
            Comb(n, k, cb, a, 1);
        }
    }
    public static void Comb(int n, int k, int[] cb, Integer[] a, int i){
        for(int j = cb[i - 1] + 1; j <= n - k + i; j++){
            cb[i] = j;
            if(i == k)Solve(k, cb, a);
            else Comb(n, k, cb, a, i + 1);
        }
    }
    public static void Solve(int k, int[] cb, Integer[] a){
        for(int i = 1; i <= k; ++i)
            System.out.print(a[cb[i] - 1] + " ");
        System.out.println();
    }
}
