
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int res = 0;
        while(t-- != 0){
            int cnt = 0;
            for(int i = 0; i < 3; ++i){
                int x = sc.nextInt();
                if(x == 1)cnt++;
            }
            if(cnt >= 2)res++;
        }
        System.out.print(res);
        
    }
    
}
