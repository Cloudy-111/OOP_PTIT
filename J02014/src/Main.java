
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int[] a = new int[n];
            int sum = 0;
            for(int i = 0; i < n; ++i){a[i] = sc.nextInt(); sum += a[i];}
            int chk = 0;
            int l = 0;
            for(int i = 0; i < n; ++i){
                if(l == sum - l - a[i]){
                    System.out.println(i + 1);
                    chk = 1;
                    break;
                }
                l += a[i];
            }
            if(chk == 0)System.out.println(-1);
        }
    }
    
}
