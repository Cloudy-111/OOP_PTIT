
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        int[] a = new int[t + 1];
        for(int i = 1; i < t; ++i){
            String[] s = sc.nextLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            a[x]++;
            a[y]++;
        }
        int cnt = 0, d = 0;
        for(int i = 1; i <= t; ++i){
            if(a[i] == 1)cnt++;
            if(a[i] == t - 1)d++;
        }
        if(cnt == t - 1 && d == 1)System.out.println("Yes");
        else System.out.println("No");
    }
    
}
