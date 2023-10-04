
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> lst = new ArrayList<>();
        for(int i = 0; i < t; ++i){
            Student a = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine());
            lst.add(a);
        }
        for(int i = 0; i < t; ++i){
            String[] a = sc.nextLine().split(" ");
            for(Student x : lst){
                if(x.getId().equals(a[0])){
                    x.setAttend(a[1]);
                    x.setNote(x.getAttend());
                }
            }
        }
        for(Student i : lst)System.out.println(i);
    }
    
}
