
import java.util.Scanner;

public class Main {
    public static int cnt = 0;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[k + 1];
        a[0] = 0;
        Comb(n, k, 1, a);
        System.out.print(String.format("Tong cong co %d to hop", cnt));
    }
    
    public static void Comb(int n, int k, int i, int[] a){
        for(int j = a[i - 1] + 1; j <= n - k + i; ++j){
            a[i] = j;
            if(i == k){
                cnt++;
                for(int x = 1; x <= k; ++x)System.out.print(a[x] + " ");
                System.out.println();
            }
            else Comb(n, k, i + 1, a);
        }
    }
    
}
