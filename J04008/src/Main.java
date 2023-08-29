
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            Point a = new Point(sc.nextDouble(), sc.nextDouble());
            Point b = new Point(sc.nextDouble(), sc.nextDouble());
            Point c = new Point(sc.nextDouble(), sc.nextDouble());
            double ab = a.distance(b);
            double bc = b.distance(c);
            double ac = c.distance(a);
            if(ab + bc > ac && ab + ac > bc && bc + ac > ab){
                double peri = ab + bc + ac;
                System.out.println(String.format("%.3f", peri));
            }
            else System.out.println("INVALID");
        }
    }
    
}
