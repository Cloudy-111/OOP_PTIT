
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String[] inp = sc.nextLine().split(" ");
        int t = Integer.parseInt(inp[0]);
        ArrayList<Student> lst = new ArrayList<>();
        while(t-- != 0){
            Student a = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            lst.add(a);
        }
        int t2 = Integer.parseInt(inp[1]);
        HashMap<Integer, BTL> lst2 = new HashMap<>();
        for(int i = 1; i <= t2; ++i){
            BTL a = new BTL(sc.nextLine(), i);
            lst2.put(i, a);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- != 0){
            int ord = Integer.parseInt(sc.nextLine());
            System.out.println("DANH SACH NHOM " + ord + ":");
            for(Student i : lst)if(i.getOrd() == ord)System.out.println(i);
            System.out.println("Bai tap dang ky: " + lst2.get(ord));
        }
    }
    
}
