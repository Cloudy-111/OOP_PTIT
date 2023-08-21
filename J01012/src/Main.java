import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            System.out.println(cnt(n));
        }
    }
    
    public static int cnt(int n){
        int res = 0;
        for(int i = 1; i < Math.sqrt((double)n); ++i){
            if(n % i == 0){
                int tmp = n / i;
                if(i % 2 == 0)res++;
                if(tmp % 2 == 0)res++;
            }
        }
        if(Math.sqrt((double)n) % 2 == 0)res++;
        return res;
    }
    
}
