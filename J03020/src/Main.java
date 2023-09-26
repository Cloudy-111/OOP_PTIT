
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> lst = new ArrayList<>();
        int len = 0;
        while(sc.hasNext()){
            String a = sc.next();
            if(Palin(a)){
                lst.add(a);
                if(a.length() > len)len = a.length();
            }
        }
        Map<String, Integer> m = new HashMap<>();
        for(String i : lst)
            if(i.length() == len)
                if(m.containsKey(i)){
                    m.put(i, m.get(i) + 1);
                }else{
                    m.put(i, 1);
                }
        ArrayList<String> s = new ArrayList<>();
        for(String i : lst)if(i.length() == len && !s.contains(i)){
            System.out.println(i + " " + m.get(i));
            s.add(i);
        }
    }
    public static Boolean Palin(String a){
        int l = 0, r = a.length() - 1;
        while(l < r){
            if(a.charAt(l) != a.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
}
