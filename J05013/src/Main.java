
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Candidate> lst = new ArrayList<>();
        while(t-- > 0){
            lst.add(new Candidate(sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine())));
        }
        Collections.sort(lst);
        for(Candidate i : lst){
            System.out.println(i);
        }
    }
    
}
