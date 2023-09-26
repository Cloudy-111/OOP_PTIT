
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            long[] a = new long[n];
            for(int i = 0; i < n; ++i)a[i] = sc.nextInt();
            int idx = 0;
            for(int i = 0; i < n - 1; ++i)if(a[i] > a[i + 1])idx = i + 1;
            System.out.println(idx);
        }
    }
    
}
