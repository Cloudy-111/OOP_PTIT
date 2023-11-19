
import java.io.*;
import java.text.ParseException;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MUAHANG.in"));
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Product> Prod = new HashMap<>();
        while(n-- > 0){
            String id = sc.nextLine();
            Prod.put(id, new Product(id, sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> lstCus = new ArrayList<>();
        while(m-- > 0){
            String name = sc.nextLine();
            String address = sc.nextLine();
            String id = sc.nextLine();
            int amount = Integer.parseInt(sc.nextLine());
            String dateBuy = sc.nextLine();
            lstCus.add(new Customer(Prod.get(id), name, address, id, amount, dateBuy));
        }
        Collections.sort(lstCus);
        for(Customer i : lstCus){
            System.out.println(i);
        }
    }
    
}
