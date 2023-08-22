import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            long n = sc.nextLong();
            long res = 0;
            for(int i = 2; i <= Math.sqrt(n); ++i){
                if(n % i == 0){
                    while(n % i == 0)n /= i;
                    res = Math.max(res, i);
                }
            }
            res = Math.max(res, n);
            System.out.println(res);
        }
    }
}
