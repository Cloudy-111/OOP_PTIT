import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Map<Long, Integer> Appear = new HashMap<>();
        Long[] a = new Long[94];
        a[0] = 0L; a[1] = 1L;
        Appear.put(a[0], 1);
        Appear.put(a[1], 1);
        
        for(int i = 2; i <= 93; ++i){a[i] = a[i - 1] + a[i - 2]; Appear.put(a[i], 1);}
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            Long n = sc.nextLong();
            if(Appear.containsKey(n))System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}