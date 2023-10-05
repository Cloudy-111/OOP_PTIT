
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Customer> lst = new ArrayList<>();
        for(int i = 1; i <= t; ++i){
            Customer a = new Customer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.setId(i);
            lst.add(a);
        }
        Collections.sort(lst);
        for(Customer i : lst)System.out.println(i);
    }
    
}
