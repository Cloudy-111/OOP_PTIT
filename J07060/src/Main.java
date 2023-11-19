import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MONTHI.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Schedule> lstSche = new ArrayList<>();
        while(n-- > 0){
            Schedule.addSub(new Subject(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc.close();
        sc = new Scanner(new File("CATHI.in"));
        int m = Integer.parseInt(sc.nextLine());
        while(m-- > 0){
            Schedule.addCathi(new CaThi(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc.close();
        sc = new Scanner(new File("LICHTHI.in"));
        int p = Integer.parseInt(sc.nextLine());
        while(p-- > 0){
            String[] inp = sc.nextLine().split(" ");
            lstSche.add(new Schedule(inp[0], inp[1], inp[2], Integer.parseInt(inp[3])));
        }
        Collections.sort(lstSche);
        for(Schedule i : lstSche){
            System.out.println(i);
        }
    }
    
}
