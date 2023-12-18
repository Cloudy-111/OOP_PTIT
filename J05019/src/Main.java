
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Times> map = new HashMap<>();
        ArrayList<Times> lst = new ArrayList<>();
        while(n-- > 0){
            Times a = new Times(sc.nextLine(), sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            if(map.containsKey(a.getName())){
                map.get(a.getName()).setTime(a.getTime() + map.get(a.getName()).getTime());
                map.get(a.getName()).setAmount(a.getAmount() + map.get(a.getName()).getAmount());
            }
            else{
                map.put(a.getName(), a);
                lst.add(a);
                Times.idx += 1;
            }
        }
        for(Times i : lst){
            System.out.println(map.get(i.getName()));
        }
    }
    
}
