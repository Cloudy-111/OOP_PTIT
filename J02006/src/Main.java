
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int lenA = sc.nextInt();
        int lenB = sc.nextInt();
        int[] a = new int[lenA];
        int[] b = new int[lenB];
        TreeSet<Integer>res = new TreeSet<>();
        for(int i = 0; i < lenA; ++i){
            a[i] = sc.nextInt();
            res.add(a[i]);
        }
        for(int i = 0; i < lenB; ++i){
            b[i] = sc.nextInt();
            res.add(b[i]);
        }
        for(Integer i : res)System.out.print(i + " ");
    }
    
}
