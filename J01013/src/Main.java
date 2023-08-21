import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] Prime = new int[2000005];
        Prime[0] = Prime[1] = 1;
        for(int i = 2; i < 1500; ++i){
            if(Prime[i] == 0){
                for(int j = i * i; j <= 2000000; j += i){
                    if(Prime[j] == 0)Prime[j] = i;
                }
            }
        }
        for(int i = 2; i < 2000000; ++i)
            if(Prime[i] == 0) Prime[i] = i;
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long res = 0;
        while(t-- != 0){
            int n = sc.nextInt();
            while(n > 1){
                res += Prime[n];
                n /= Prime[n];
            }
        }
        System.out.println(res);
    }
}
