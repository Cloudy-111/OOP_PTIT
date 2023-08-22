
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
            if(check(a))System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static Boolean check(int[] a){
        int l = 0, r = a.length - 1;
        while(l < r){
            if(a[l] != a[r])return false;
            l++;
            r--;
        }
        return true;
    }
    
}
