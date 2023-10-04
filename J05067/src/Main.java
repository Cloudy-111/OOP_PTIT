
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Product> lst = new ArrayList<>();
        while(t-- != 0){
            String s = sc.nextLine();
            String[] tmp = s.split(" ");
            Product a = new Product(tmp[0], Integer.parseInt(tmp[1]));
            lst.add(a);
        }
        for(Product i : lst)System.out.println(i);
    }
    
}
