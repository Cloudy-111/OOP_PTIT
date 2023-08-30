
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Item> items = new ArrayList<>();
        for(int i = 1; i <= t; ++i){
            sc.nextLine();
            String name = sc.nextLine(), unit = sc.next();
            int buy = sc.nextInt(), sell = sc.nextInt();
            Item a = new Item(name, unit, buy, sell);
            a.setId(i);
            //System.out.println(a);
            items.add(a);
        }
        Collections.sort(items);
        for(Item i : items)System.out.println(i);
    }
    
}
