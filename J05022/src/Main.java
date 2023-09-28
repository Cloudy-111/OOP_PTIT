
import java.util.ArrayList;
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
        int q = Integer.parseInt(sc.nextLine());
        while(q-- != 0){
            String grade = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + grade + ":");
            for(Student i : lst)if(grade.equals(i.getGrade()))System.out.println(i);
        }
    }
}
