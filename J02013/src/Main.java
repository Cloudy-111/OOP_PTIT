
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i)a[i] = sc.nextInt();
        int chk = 0;
        int cnt = 1;
        while(chk == 0){
            chk = 1;
            for(int i = 0; i < n - 1; ++i){
                if(a[i] > a[i + 1]){
                    int tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                    chk = 0;
                }
            }
            if(chk == 0){
                System.out.print(String.format("Buoc %d: ", cnt));
                for(int i = 0; i < n; ++i)System.out.print(a[i] + " ");
                System.out.println();
            }
            cnt++;
        }
    }
    
}
