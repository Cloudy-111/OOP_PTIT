
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Candi> lst = new ArrayList<>();
        for(int i = 1; i <= t; ++i){
            Candi a = new Candi(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            a.setId(i);
            lst.add(a);
        }
        for(Candi i : lst)System.out.println(i);
    }
    
}
