import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i = 1; i <= t; ++i){
            int n = sc.nextInt();
            ptich(n,i);
            System.out.println();
        }
    }
    
    public static void ptich(int n, int id){
        System.out.print(String.format("Test %d: ", id));
        int i = 2;
        while(n > 1){
            int cnt = 0;
            while(n % i == 0){
                n/=i;
                cnt++;
            }
            if(cnt != 0)System.out.print(String.format("%d(%d) ", i, cnt));
            i++;
            cnt = 0;
        }
    }
    
}
