
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int lenA = sc.nextInt(), lenB = sc .nextInt();
        TreeSet<Integer>s = new TreeSet<>(), res = new TreeSet<>();
        int[] a = new int[lenA];
        int[] b = new int[lenB];
        for(int i = 0; i < lenA; ++i){a[i] = sc.nextInt(); s.add(a[i]);}
        for(int i = 0; i < lenB; ++i){
            b[i] = sc.nextInt(); 
            if(s.contains(b[i]))
                res.add(b[i]);
        }
        for(Integer i : res)System.out.print(i + " ");
    }
    
}
