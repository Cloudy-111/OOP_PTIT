
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- > 0){
            int n = Integer.parseInt(sc.nextLine());
            ArrayList<Point> lst = new ArrayList<>();
            while(n-- > 0){
                String[] inp = sc.nextLine().split(" ");
                lst.add(new Point(Double.parseDouble(inp[0]), Double.parseDouble(inp[1])));
            }
            double area = Area(lst.get(0), lst.get(1), lst.get(2));
            for(int i = 3; i < lst.size(); i++)area += Area(lst.get(0), lst.get(i - 1), lst.get(i));
            System.out.printf("%.3f\n", area);
        }
    }
    public static double Area(Point a, Point b, Point c){
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ac = a.distance(c);
        return Math.sqrt((ab + bc + ac) * (ab + bc - ac) * (ab - bc + ac) * (-ab + bc + ac)) / 4;
    }
}
