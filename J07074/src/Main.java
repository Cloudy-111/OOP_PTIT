
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MONHOC.in"));
        ArrayList<Subject> lst = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            Subject a = new Subject(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            lst.add(a);
        }
        Scanner sc1 = new Scanner(new File("LICHGD.in"));
        int m = Integer.parseInt(sc1.nextLine());
        ArrayList<Schedule> lstSche = new ArrayList<>();
        while(m-- > 0){
            String id = sc1.nextLine();
            for(Subject i : lst){
                if(i.getSubjectId().equals(id)){
                    lstSche.add(new Schedule(id, i.getSubjectName(), i.getCredits(), Integer.parseInt(sc1.nextLine()), Integer.parseInt(sc1.nextLine()), sc1.nextLine(), sc1.nextLine()));
                    break;
                }
            }
        }
        Collections.sort(lstSche);
        String idSub = sc1.nextLine();
        for(Subject i : lst)if(i.getSubjectId().equals(idSub)){
            System.out.println("LICH GIANG DAY MON " + i.getSubjectName() + ":");
            break;
        }
        for(Schedule i : lstSche){
            if(idSub.equals(i.getIDSub())){
                System.out.println(i);
            }
        }
    }
    
}
