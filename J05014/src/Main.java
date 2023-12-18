
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Teacher> lst = new ArrayList<>();
        while(n-- > 0){
            lst.add(new Teacher(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(lst);
        for(Teacher i : lst){
            System.out.println(i);
        }
    }
    
}
