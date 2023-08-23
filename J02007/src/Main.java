
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int zi = 1; zi <= t; ++zi){
            int n = sc.nextInt();
            int[] f = new int[100001];
            Set<Integer>s = new LinkedHashSet<>();
            for(int i = 0; i < n; ++i){
                int x = sc.nextInt();
                f[x]++;
                s.add(x);
            }
            System.out.println(String.format("Test %d: ", zi));
            for(Integer i : s)
                System.out.println(String.format("%d xuat hien %d lan", i, f[i]));
        }
    }
    
}
