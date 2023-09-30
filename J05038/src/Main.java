
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Staff> lst = new ArrayList<>();
        long Sum = 0L;
        for(int i = 1; i <= t; ++i){
            Staff a = new Staff(sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()), sc.nextLine());
            a.setId(i);
            Sum += a.getTotal();
            lst.add(a);
        }
        for(Staff i : lst)System.out.println(i);
        System.out.println("Tong chi phi tien luong: " + Sum);
    }
    
}
