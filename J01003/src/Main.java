import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if (a == 0 && b != 0)System.out.println("VN");
        else if (b == 0)System.out.println("VSN");
        else{
            System.out.println(String.format("%.2f", -b/a));
        }
    }
    
}
