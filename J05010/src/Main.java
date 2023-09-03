
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Item> lst = new ArrayList<>();
        for(int i = 1; i <= t; ++i){
            sc.nextLine();
            Item a = new Item(sc.nextLine(), sc.nextLine(),sc.nextDouble(), sc.nextDouble());
            a.setId(i);
            lst.add(a);
        }
        Collections.sort(lst);
        for(Item i : lst)System.out.println(i);
    }
    
}
