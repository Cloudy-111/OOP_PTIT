
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Order> lst = new ArrayList<>();
        while(t-- != 0){
            Order a = new Order(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            lst.add(a);
        }
        for(Order i : lst)System.out.println(i);
    }
    
}
