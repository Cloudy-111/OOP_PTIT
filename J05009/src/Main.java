
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> lst = new ArrayList<>();
        int t = sc.nextInt();
        double m = 0;
        for(int i = 1; i <= t; ++i){
            sc.nextLine();
            Student a = new Student(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
            a.setId(i);
            m = Double.max(m, a.getSum());
            lst.add(a);
        }
        Collections.sort(lst);
        for(Student i : lst)if(i.getSum() == m)System.out.println(i);
    }
    
}
