
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> lst = new ArrayList<>();
        while(t-- != 0){
            //sc.nextLine();
            Student a = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            lst.add(a);
        }
        Collections.sort(lst);
        for(Student i : lst)System.out.println(i);
    }
}
