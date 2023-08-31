
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Student a = new Student(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        a.setPriority(a.getId());
        double sum = a.getSum() + a.getPriority();
        a.setStat(sum);
        System.out.println(a);
    }
    
}
