
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t1 = Integer.parseInt(sc.nextLine());
        ArrayList<CLB> lst1 = new ArrayList<>();
        while(t1-- != 0){
            CLB a = new CLB(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            lst1.add(a);
        }
        int t2 = Integer.parseInt(sc.nextLine());
        ArrayList<Match> lst2 = new ArrayList<>();
        while(t2-- != 0){
            String[] tmp = sc.nextLine().split(" ");
            Match a = new Match(tmp[0], Long.parseLong(tmp[1]));
            for(CLB i : lst1)if(a.getIdClb().equals(i.getId())){
                a.setName(i.getName());
                a.setNumOfFan(i.getNum());
            }
            lst2.add(a);
        }
        for(Match i : lst2)System.out.println(i);
    }
    
}
