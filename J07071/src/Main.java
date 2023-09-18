
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DANHSACH.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Name> lst = new ArrayList<>(), res = new ArrayList<>();
        ArrayList<String> lst1 = new ArrayList<>();
        
        while(t-- != 0)
            lst.add(new Name(sc.nextLine()));
        Collections.sort(lst);
        int m = Integer.parseInt(sc.nextLine());
        while(m-- != 0){
            String s = sc.nextLine();
            for(Name i : lst){
                if(comp(s, i.getComp()))System.out.println(i);
            }
        }
        
    }
    public static Boolean comp(String a, String b){
        if(a.length() != b.length())return false;
        for(int i = 0; i < a.length(); ++i){
            if(a.charAt(i) == '*')continue;
            if(a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
    
}
