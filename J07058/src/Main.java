
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<Subject> lst = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            Subject a = new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine());
            lst.add(a);
        }
        Collections.sort(lst);
        for(Subject i : lst)System.out.println(i);
    }
    
}
