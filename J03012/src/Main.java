
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            String a = sc.next(), b = sc.next();
            BigInteger A = new BigInteger(a), B = new BigInteger(b);
            System.out.println(A.add(B).toString());
        }
        
    }
    
}
