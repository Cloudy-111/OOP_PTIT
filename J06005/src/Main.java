
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Bill> lst = new ArrayList<>();
        while(n-- > 0){
            Bill.addCus(new Customer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        int m = Integer.parseInt(sc.nextLine());
        while(m-- > 0){
            Bill.addProd((new Product(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()))));
        }
        int p = Integer.parseInt(sc.nextLine());
        while(p-- > 0){
            lst.add(new Bill(sc.next(), sc.next(), sc.nextInt()));
        }
        Collections.sort(lst);
        for(Bill i : lst){
            System.out.println(i);
        }
    }
    
}
