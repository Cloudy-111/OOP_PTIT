
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
            long res = 0;
            for(int i = 0; i < n; ++i){
                int idx = Lower(a, a[i] + k, n);
                if(idx - i - 1 > 0)res += idx - i - 1;            
            }
            System.out.println(res);
        }
    }
    public static int Lower(Integer[] a, int x, int n){
        int l = -1, r = n;
        while(l + 1 < r){
            int mid = (l + r) / 2;
            if(a[mid] >= x)r = mid;
            else l = mid;
        }
        return r;
    }
}
