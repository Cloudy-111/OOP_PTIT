
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("KH.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Bill> lst = new ArrayList<>();
        while(n-- > 0){
            Bill.addCus(new Customer(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc.close();
        Scanner sc1 = new Scanner(new File("MH.in"));
        int m = Integer.parseInt(sc1.nextLine());
        while(m-- > 0){
            Bill.addProd((new Product(sc1.nextLine(), sc1.nextLine(), Long.parseLong(sc1.nextLine()), Long.parseLong(sc1.nextLine()))));
        }
        sc1.close();
        Scanner sc2 = new Scanner(new File("HD.in"));
        int p = Integer.parseInt(sc2.nextLine());
        while(p-- > 0){
            lst.add(new Bill(sc2.next(), sc2.next(), sc2.nextInt()));
        }
        sc2.close();
        //Collections.sort(lst);
        for(Bill i : lst){
            System.out.println(i);
        }
    }
    
}
