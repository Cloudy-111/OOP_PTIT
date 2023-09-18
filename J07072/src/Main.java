
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        ArrayList<Name> lst = new ArrayList<>();
        while(sc.hasNextLine())
            lst.add(new Name(sc.nextLine()));
        Collections.sort(lst);
        for(Name i : lst)System.out.println(i);
    }
    
}
