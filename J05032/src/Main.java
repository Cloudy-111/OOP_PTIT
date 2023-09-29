
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Person> lst = new ArrayList<>();
        while(t-- != 0){
            String[] per = sc.nextLine().split(" ");
            Person a = new Person(per[0], per[1]);
            lst.add(a);
        }
        Collections.sort(lst);
        System.out.println(lst.get(0));
        System.out.println(lst.get(lst.size() - 1));
    }
    
}
