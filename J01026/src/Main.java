
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            double n = sc.nextDouble();
            long x = Math.round(Math.sqrt(n));
            if(x * x == n)System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
