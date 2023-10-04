
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t1 = Integer.parseInt(sc.nextLine());
        HashMap<String, Dept> lst1 = new HashMap<>();
        while(t1-- != 0){
            String[] tmp = sc.nextLine().split(" ");
            String t = "";
            for(int i = 1; i < tmp.length; ++i){
                t += tmp[i];
                if(i != tmp.length - 1)t += " ";
            }
            Dept a = new Dept(tmp[0], t);
            lst1.put(a.getId(), a);
        }
        int t2 = Integer.parseInt(sc.nextLine());
        ArrayList<Staff> lst2 = new ArrayList<>();
        while(t2-- != 0){
            String s = sc.nextLine();
            String name = sc.nextLine();
            long base = Long.parseLong(sc.nextLine());
            int day = Integer.parseInt(sc.nextLine());
            Staff a = new Staff(lst1.get(s.substring(3)),s, name, base, day);
            lst2.add(a);
        }
        for(Staff i : lst2)System.out.println(i);
    }
    
}
