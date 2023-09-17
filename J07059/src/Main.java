
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("CATHI.in"));
        ArrayList<Cathi> lst = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; ++i){
            Cathi a = new Cathi(sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.setId(i);
            lst.add(a);
        }
        Collections.sort(lst);
        for(Cathi i : lst)System.out.println(i);
    }
    
}
