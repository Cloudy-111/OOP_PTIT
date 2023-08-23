
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][n];
        for(int i = 0; i < n; ++i)
            for(int j = 0; j < n; ++j)a[i][j] = sc.nextInt();
        for(int i = 0; i < n; ++i){
            for(int j = i + 1; j < n ; ++j){
                if(a[i][j] == 1)System.out.println(String.format("(%d,%d)", i + 1,j + 1));
            }
        }
    }
    
}