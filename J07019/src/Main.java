
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA1.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> lst = new ArrayList<>();
        while(n-- > 0){
            lst.add(new Product(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        ArrayList<Bill> lstBill = new ArrayList<>();
        Scanner sc1 = new Scanner(new File("DATA2.in"));
        int m = Integer.parseInt(sc1.nextLine());
        while(m-- > 0){
            String type = sc1.nextLine();
            String typeFirst = type.substring(0,2);
            char typeLast = type.charAt(2);
            int amount = Integer.parseInt(type.substring(4));
            for(Product i : lst){
                if(i.getTypeId().equals(typeFirst)){
                    lstBill.add(new Bill(typeFirst, i.getName(), i.getPrice1(), i.getPrice2(), typeLast, amount));
                }
            }
        }
        //Collections.sort(lstBill);
        for(Bill i : lstBill)System.out.println(i);
    }
    
}
