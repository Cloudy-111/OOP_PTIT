
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Phanso a = new Phanso(sc.nextLong(), sc.nextLong());
        Phanso b = new Phanso(sc.nextLong(), sc.nextLong());
        Phanso sum = new Phanso(a,b);
        long t = sum.getTuso();
        long m = sum.getMauso();
        long UCLN = gcd(t, m);
        sum.setTuso(t / UCLN);
        sum.setMauso(m / UCLN);
        System.out.println(sum);
    }
    public static long gcd(long a, long b){
        while(b > 0){
            return gcd(b, a % b);
        }
        return a;
    }
}
