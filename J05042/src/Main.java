
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
            String name = sc.nextLine();
            String[] x = sc.nextLine().split(" ");
            Student a = new Student(name, Integer.parseInt(x[0]), Integer.parseInt(x[1]));
            lst.add(a);
        }
        Collections.sort(lst);
        for(Student i : lst)System.out.println(i);
    }
    
}
