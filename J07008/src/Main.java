import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static int n;
    public static int[] a = new int[100];
    public static int[] X = new int[100];
    public static ArrayList<String> lst = new ArrayList<>();
     
    public static void Loop(int i, int pos){
        for(int j = pos; j <= n; ++j){
            X[i] = a[j];
            if(i > 1 && X[i] > X[i - 1]){
                StringBuilder sb = new StringBuilder("");
                for(int k = 1; k <= i; ++k)sb.append(X[k]).append(" ");
                lst.add(sb.toString());
                Loop(i + 1, j + 1);
            }
            else if(X[i] > X[i - 1])Loop(i + 1, j + 1);
        }
    }

    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DAYSO.in"));
        n = sc.nextInt();
        for(int i = 1;i <= n; ++i)a[i] = sc.nextInt();
        Loop(1, 1);
        lst.sort(null);
        for(String i : lst)System.out.println(i);
    }
    
}