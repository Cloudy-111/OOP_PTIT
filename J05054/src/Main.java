
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> lst = new ArrayList<>(); 
        ArrayList<Student> tmp = new ArrayList<>();
        for(int i = 1; i <= t; ++i){
            Student a = new Student(sc.nextLine(), Double.parseDouble(sc.nextLine()));
            a.setId(i);
            lst.add(a);
            tmp.add(a);
        }
        Collections.sort(tmp);
        int cnt = 1;
        double curr = tmp.get(0).getPoint();
        int d = 0;
        for(Student i : tmp){
            if(i.getPoint() != curr){
                curr = Math.min(curr, i.getPoint());
                cnt += d;
                d = 1;
            } 
            else d += 1;
            i.setOrd(cnt);
        }
        for(Student i : lst)System.out.println(i);
    }
    
}
