
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t1 = Integer.parseInt(sc.nextLine());
        HashMap<String, Product> lst = new HashMap<>();
        while(t1-- != 0){
            Product a = new Product(sc.nextLine(), sc.nextLine(), sc.nextLine());
            lst.put(a.getId(), a);
        }
        int t2 = Integer.parseInt(sc.nextLine());
        ArrayList<Bill> lst2 = new ArrayList<>();
        
        while(t2-- != 0){
            String[] tmp = sc.nextLine().split(" ");
            Bill a = new Bill(lst.get(tmp[0]), Long.parseLong(tmp[1]), Long.parseLong(tmp[2]), Long.parseLong(tmp[3]));
            lst2.add(a);
        }
        for(Bill i : lst2)System.out.println(i);
    }
    
}
