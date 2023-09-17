
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        int t = sc.nextInt();
        ArrayList<Guest> lst = new ArrayList<>();
        for(int i = 1; i <= t; ++i){
            sc.nextLine();
            Guest a = new Guest(sc.nextLine(), sc.next(), sc.nextInt(), sc.nextInt());
            a.setId(i);
            lst.add(a);
        }
        Collections.sort(lst);
        for(Guest i : lst)System.out.println(i);
    }
    
}
