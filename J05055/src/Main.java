
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Atheles> lst = new ArrayList<>();
        ArrayList<Atheles> tmp = new ArrayList<>();
        for(int i = 1; i <= t; ++i){
            Atheles a = new Atheles(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.setId(i);
            lst.add(a);
            tmp.add(a);
        }
        Collections.sort(tmp);
        int cnt = 1;
        double curr = tmp.get(0).getResult();
        int d = 0;
        for(Atheles i : tmp){
            if(i.getResult()!= curr){
                curr = Math.min(curr, i.getResult());
                cnt += d;
                d = 1;
            } 
            else d += 1;
            i.setOrd(cnt);
        }
        for(Atheles i : lst)System.out.println(i);
    }
    
}
