import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long gcd = GCD(a,b);
            System.out.println(String.format("%d %d", (Long)a * b / gcd, gcd));
        }
    }
    
    public static long GCD(long a,long b){
        while(b != 0){
            long tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
    
}
