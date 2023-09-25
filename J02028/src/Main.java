
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            long k = sc.nextLong();
            int[] a = new int[n];
            for(int i = 0; i < n; ++i)a[i] = sc.nextInt();
            HashMap<Long, Integer> lst = new HashMap<>();
            long pre = 0;
            int chk = 0;
            for(int i = 0; i < n; ++i){
                pre += a[i];
                if(pre == k)chk = 1;
                if(lst.containsKey(pre - k))chk = 1;
                lst.put(pre, i);
            }
            if(chk == 0)System.out.println("NO");
            else System.out.println("YES");
        }
    }
    
}

