
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Consumer> lst = new ArrayList<>();
        for(int i = 1; i <= t; ++i){
            Consumer a = new Consumer(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            a.setId(i);
            lst.add(a);
        }
        for(Consumer i : lst)System.out.println(i);
    }
    
}
