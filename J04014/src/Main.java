
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            Phanso a = new Phanso(sc.nextLong(), sc.nextLong());
            Phanso b = new Phanso(sc.nextLong(), sc.nextLong());
            
            Phanso tmp = a.sum(b).simplify();
            Phanso c = tmp.mul(tmp).simplify();
            
            Phanso tmp1 = a.mul(b).simplify();
            Phanso d = tmp1.mul(c).simplify();
            System.out.println(c + " " + d);
        }
    }
}
