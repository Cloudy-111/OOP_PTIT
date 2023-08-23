
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] b = new int[201];
        int m = 0;
        for(int i = 0; i< n; ++i){
            int x = sc.nextInt();
            m = Math.max(m, x);
            b[x] = 1;
        }
        int chk = 0;
        for(int i = 1; i <= m; ++i)
            if(b[i] == 0){
                System.out.println(i);
                chk = 1;
            }
        if(chk == 0)System.out.print("Excellent!");
        
    }
    
}
