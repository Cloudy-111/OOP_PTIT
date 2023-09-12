
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("THISINH.in"));
        ArrayList<Student> lst = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            Student a = new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            lst.add(a);
        }
        int num = Integer.parseInt(sc.nextLine());
        if(num > lst.size())num = lst.size();
        Collections.sort(lst);
        double floor = lst.get(num - 1).getSum();
        System.out.printf("%.1f\n", floor);
        for(Student i : lst){
            if(i.getSum() >= floor)i.setStat("TRUNG TUYEN");
            else i.setStat("TRUOT");
            System.out.println(i);
        }
    }
    
}
