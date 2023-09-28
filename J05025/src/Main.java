
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Teacher> lst = new ArrayList<>();
        for(int i = 1; i <= t; ++i){
            Teacher a = new Teacher(sc.nextLine(), sc.nextLine());
            a.setId(i);
            lst.add(a);
        }
        Collections.sort(lst);
        for(Teacher i : lst)System.out.println(i);
    }
    
}
