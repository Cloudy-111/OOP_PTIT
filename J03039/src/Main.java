
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            String n = sc.nextLine();
            String[] s = n.split(" ");
            BigInteger biga = new BigInteger(s[0]), bigb = new BigInteger(s[1]);
            if(biga.mod(bigb) == BigInteger.ZERO || bigb.mod(biga) == BigInteger.ZERO)System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
}
