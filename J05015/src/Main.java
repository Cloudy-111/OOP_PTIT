
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Atheles> lst = new ArrayList<>();
        while(t-- > 0){
            lst.add(new Atheles(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        Collections.sort(lst);
        for(Atheles i : lst){
            System.out.println(i);
        }
    }
    
}
