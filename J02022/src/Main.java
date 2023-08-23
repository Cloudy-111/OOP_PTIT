
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int[] used = new int[10];
            int[] a = new int[10];
            int n = sc.nextInt();
            hoanVi(n, 1, a, used);
        }
    }
    
    public static void hoanVi(int n,int i, int[] a, int[] used){
        for(int j = 1; j <= n; ++j){
            if(used[j] == 0){
                used[j] = 1;
                a[i] = j;
                if(i == n)In(n,a);
                else hoanVi(n, i + 1, a, used);
                used[j] = 0;
            }
        }
    }
    
    public static void In(int n, int[] a){
        for(int i = 1; i < n; ++i)if(Math.abs(a[i] - a[i + 1])== 1)return;
        for(int i = 1; i <= n; ++i)System.out.print(a[i]);
        System.out.println();
    }
    
}
