
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here]
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Consumer> lst = new ArrayList<>();
        while(t-- > 0){
            lst.add(new Consumer(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine())));
        }
        Collections.sort(lst);
        for (Consumer i : lst){
            System.out.println(i);
        }
    }
    
}
