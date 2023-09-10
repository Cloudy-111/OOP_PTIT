
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> lst1 = (ArrayList<Integer>)os.readObject();
        Set<Integer> s1 = new TreeSet<Integer>(lst1);
        os = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> lst2 = (ArrayList<Integer>)os.readObject();
        Set<Integer> s2 = new TreeSet<Integer>(lst2);
        Set<Integer> res = new TreeSet<>();
        for(Integer i : s1){
            if(s2.contains(i) && check(i))res.add(i);
            if(res.size() == 10)break;
        }
        for(Integer i : res){
            int f = Collections.frequency(lst1, i) + Collections.frequency(lst2, i);
            System.out.println(i + " " + f);
        }
    }
    public static Boolean check(int a){
        String s = "" + a;
        if(s.length() == 1 || s.length() % 2 == 0)return false;
        for(int i = 0; i < s.length(); ++i)if((s.charAt(i) - '0') % 2 == 0)return false;
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r))return false;
            l++; 
            r--;
        }
        return true;
    }
}
