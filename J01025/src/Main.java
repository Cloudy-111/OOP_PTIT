
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt(), y1 = sc.nextInt(), x2 = sc.nextInt(), y2 = sc.nextInt();
        int x3 = sc.nextInt(), y3 = sc.nextInt(), x4 = sc.nextInt(), y4 = sc.nextInt();
        int a1 = Math.min(x1,x3), b1 = Math.min(y1, y3);
        int a2 = Math.max(x2, x4), b2 = Math.max(y2, y4);
        int edge = Math.max(a2 - a1, b2 - b1);
        System.out.println(edge * edge);
    }
    
}
