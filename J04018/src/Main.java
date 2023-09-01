
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            Complex a = new Complex(sc.nextLong(), sc.nextLong());
            Complex b = new Complex(sc.nextLong(), sc.nextLong());
            
            Complex tmp = a.sum(b);
            Complex c = tmp.mul(a);
            Complex d = tmp.mul(tmp);
            System.out.println(c + ", " + d);
        }
    }
    
}
