
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Product> lst = new ArrayList<>();
        Map<String, Integer> m = new HashMap<>();
        while(t-- != 0){
            Product a = new Product(sc.nextLine(), Integer.parseInt(sc.nextLine()), Long.parseLong(sc.nextLine()));
            
            lst.add(a);
        }
        for(Product i : lst){
            if(m.containsKey(i.getId()))m.put(i.getId(), m.get(i.getId()) + 1);
            else m.put(i.getId(), 1);
            i.setOrd(m.get(i.getId()));
            System.out.println(i);
        }
    }
    
}
