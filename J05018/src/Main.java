
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Student> lst = new ArrayList<>();
        for(int i = 1; i <= t; ++i){
            sc.nextLine();
            double[] a = new double[10];
            String name = sc.nextLine();
            for(int j = 0; j < 10; ++j)a[j] = sc.nextDouble();
            Student A = new Student(name, a);
            A.setId(i);
            A.setRank(A.getAve());
            lst.add(A);
        }
        Collections.sort(lst);
        for(Student i : lst)System.out.println(i);
    }
    
}
