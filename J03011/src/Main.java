
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            long a = sc.nextLong();
            String B = sc.next();
            long b = 0L;
            for(int i = 0; i < B.length(); ++i){
                b = (b * 10 + B.charAt(i)- '0') % a;
                //làm y như phép chia bình thường, chia như kiểu cấp 1 ý
            }
            System.out.println(GCD(a, b));
        }
    }
    public static long GCD(long a, long b){
        if(b == 0)return a;
        return GCD(b, a % b);
    }
}
