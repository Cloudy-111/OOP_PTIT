
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Product> lst = new ArrayList<>();
        for(int i = 1; i <= t; ++i){
            Product a = new Product(sc.nextLine(), sc.nextLine(), Long.parseLong(sc.nextLine()), Long.parseLong(sc.nextLine()));
            a.setId(i);
            lst.add(a);
        }
        for(Product i : lst)System.out.println(i);
    }
    
}
