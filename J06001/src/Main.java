
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Product> lst = new ArrayList<>();
        while(n-- > 0){
            lst.add(new Product(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine())));
        }
        ArrayList<Bill> lstBill = new ArrayList<>();
        int m = Integer.parseInt(sc.nextLine());
        while(m-- > 0){
            String type = sc.nextLine();
            String typeFirst = type.substring(0,2);
            char typeLast = type.charAt(2);
            int amount = Integer.parseInt(type.substring(4));
            for(Product i : lst){
                if(i.getTypeId().equals(typeFirst)){
                    lstBill.add(new Bill(typeFirst, i.getName(), i.getPrice1(), i.getPrice2(), typeLast, amount));
                }
            }
        }
        for(Bill i : lstBill)System.out.println(i);
    }
    
}
