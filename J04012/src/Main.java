
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Staff a = new Staff(sc.nextLine(), sc.nextLong(), sc.nextInt(), sc.next());
        System.out.println(a);
    }
    
}
