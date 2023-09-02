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
            Student a = new Student();
            String name = sc.nextLine();
            String grade = sc.nextLine();
            String birthDay = sc.nextLine();
            double GPA = sc.nextDouble();
            a.setGPA(GPA);
            a.setGrade(grade);
            a.setName(name);
            a.setId(i);
            a.setBirthday(birthDay);
            lst.add(a);
        }
        Collections.sort(lst);
        for(Student i : lst)System.out.println(i);
    }
    
}