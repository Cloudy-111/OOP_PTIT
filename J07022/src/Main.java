
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> lst = new ArrayList<>();
        while(sc.hasNext()){
            String s = sc.next();
            try {
                int a = Integer.parseInt(s);
            } catch (Exception e) {
                lst.add(s);
            }
        }
        Collections.sort(lst);
        for(String i : lst)System.out.print(i + " ");
    }
    
}
