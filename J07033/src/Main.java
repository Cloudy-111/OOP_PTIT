
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> lst = new ArrayList<>();
        while(t-- != 0){
            Student a = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            lst.add(a);
        }
        Collections.sort(lst);
        for(Student i : lst)System.out.println(i);
    }
    
}
