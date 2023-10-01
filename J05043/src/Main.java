
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Staff> lst = new ArrayList<>();
        for(int i = 1; i <= t; ++i){
            Staff a = new Staff(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            a.setId(i);
            lst.add(a);
        }
        for(Staff i : lst)System.out.println(i);
    }
    
}
