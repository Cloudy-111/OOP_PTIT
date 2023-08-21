import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); int b = sc.nextInt();
        if( a <= 0 || b <= 0)System.out.println(0);
        else
            System.out.println(2 * (a + b) + " " + a * b);
        
    }
    
}
