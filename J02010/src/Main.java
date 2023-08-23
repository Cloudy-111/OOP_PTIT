
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; ++i)a[i] = sc.nextInt();
        for(int i = 0; i < n - 1; ++i){
            for (int j = i + 1; j < n; ++j)
                if(a[j] < a[i]){
                    int tmp = a[j];
                    a[j] = a[i];
                    a[i] = tmp;
                }
            System.out.print(String.format("Buoc %d: ", i + 1));
            for(int j = 0; j < n; ++j)System.out.print(a[j] + " ");
            System.out.println();
        }
            
        
        
    }
    
}
