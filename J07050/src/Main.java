
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MATHANG.in"));
        ArrayList<Product> lst = new ArrayList<>();
        int t = sc.nextInt();
        for(int i = 1; i <= t; ++i){
            sc.nextLine();
            Product a = new Product(sc.nextLine(), sc.nextLine(), sc.nextDouble(), sc.nextDouble());
            a.setId(i);
            lst.add(a);
        }
        Collections.sort(lst);
        for(Product i : lst)System.out.println(i);
    }
    
}
