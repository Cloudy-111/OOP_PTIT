
import java.util.Scanner;

public class Point {
    private double x, y, dist;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public static Point nextPoint(Scanner sc){
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        return new Point(x, y);
    }
    public double distance(Point b){
        return Math.sqrt(Math.pow(this.x - b.x, 2) + Math.pow(this.y - b.y, 2));
    }
}
