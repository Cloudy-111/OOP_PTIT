
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i)a[i] = sc.nextInt();
        for(int i = 0; i < n - 1; ++i){
            int m = i;
            for(int j = i + 1; j < n; ++j){
                if(a[j] < a[m])m = j;
            }
            if(m != i){
                int tmp = a[i];
                a[i] = a[m];
                a[m] = tmp;
            }
            System.out.print(String.format("Buoc %d: ", i + 1));
            for(int j = 0; j < n; ++j)System.out.print(a[j] + " ");
            System.out.println();
        
        }
    }
    
}
