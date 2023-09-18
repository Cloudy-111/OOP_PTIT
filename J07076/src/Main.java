import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MATRIX.in"));
        int t = sc.nextInt();
        while(t-- != 0){
            sc.nextLine();
            int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
            int tmp = k;
            sc.nextLine();
            int[] a = new int[n * m + 1];
            for(int i = 1; i <= n * m; ++i)a[i] = sc.nextInt();
            ArrayList<Integer> lst = new ArrayList<>();
            for(int i = 1; i <= n * m; ++i)if(i == k){
                lst.add(a[i]);
                k = k + m;
            }
            Collections.sort(lst);
            int cnt = 0;
            for(int i = 1; i <= n * m; ++i){
                if(i == tmp){
                    a[i] = lst.get(cnt);
                    cnt++; tmp += m;
                }
            }
            for(int i = 1; i <= n * m; ++i){
                System.out.print(a[i] + " ");
                if(i % m == 0)System.out.println();
            }
            System.out.println();
        }
    }
    
}