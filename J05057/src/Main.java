
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> lst = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            Student a = new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            lst.add(a);
        }
        double floor = 24.0;
        for(Student i : lst){
            if(i.getSum() >= floor)i.setStat("TRUNG TUYEN");
            else i.setStat("TRUOT");
            System.out.println(i);
        }
    }
    
}
