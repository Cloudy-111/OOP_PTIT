
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            Integer[] a = new Integer[n];
            for(int i = 0; i < n; ++i)a[i] = sc.nextInt();
            Arrays.sort(a, Collections.reverseOrder());
            int[] mark = new int[n];
            loop(n, mark, 0, a);
        }
    }
    public static void loop(int n, int[] mark, int i, Integer[] a){
        for(int j = 0; j <= 1; ++j){
            mark[i] = j;
            if(i == n - 1)Solve(n, mark, a);
            else loop(n, mark, i + 1, a);
        }
    }
    public static void Solve(int n, int[] mark, Integer[] a){
        int sum = 0;
        for(int i = 0; i < n; ++i)if(mark[i] == 1)sum += a[i];
        if(isPrime(sum)){
            for(int i = 0; i < n; ++i)if(mark[i] == 1)System.out.print(a[i] + " ");
            System.out.println();
        }
    }
    public static Boolean isPrime(int n){
        if(n < 2)return false;
        if(n == 2 || n == 3)return true;
        if(n % 2 == 0 || n % 3 == 0)return false;
        int i = 5;
        while(i * i <= n){
            if(n % i == 0 || n % (i + 2) == 0)return false;
            i += 6;
        }
        return true;
    }
}
