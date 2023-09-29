
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> lst = new ArrayList<>();
        for(int i = 1; i <= t; ++i){
            Student a = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.setOrd(i);
            lst.add(a);
        }
        Collections.sort(lst);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- != 0){
            String com = sc.nextLine();
            for(Student i : lst)if(com.equals(i.getCom()))System.out.println(i);
        }
    }
    
}
