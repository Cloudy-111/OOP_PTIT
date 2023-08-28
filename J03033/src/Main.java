
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            String a = sc.next(), b = sc.next();
            BigInteger biga = new BigInteger(a), bigb = new BigInteger(b);
            BigInteger gcd = biga.gcd(bigb);
            BigInteger res = biga.multiply(bigb).divide(gcd);
            System.err.println(res);
        }
    }
    
}
