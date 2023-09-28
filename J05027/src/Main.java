
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
        int q = Integer.parseInt(sc.nextLine());
        while(q-- != 0){
            String search = sc.nextLine();
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA " + search + ":");
            for(Teacher i : lst)if(i.getName().toLowerCase().contains(search.toLowerCase()))System.out.println(i);
        }
    }
    
}
