
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Teacher a = new Teacher(sc.nextLine(), sc.nextLine(), sc.nextLong());
        String id = a.getId();
        a.setAllowance(id);
        a.setBase(id);
        a.setWageTotal();
        System.out.println(a);
    }
    
}
