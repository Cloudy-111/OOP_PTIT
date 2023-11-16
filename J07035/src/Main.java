
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        Map<String, Student> lstStud = new HashMap<>();
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            Student a = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            lstStud.put(a.getIdStud(), a);
        }
        sc.close();
        sc = new Scanner(new File("MONHOC.in"));
        Map<String, Subject> lstSub = new HashMap<>();
        int m = Integer.parseInt(sc.nextLine());
        while(m-- > 0){
            Subject a = new Subject(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            lstSub.put(a.getId(), a);
        }
        sc.close();
        sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<BangDiem> lst = new ArrayList<>();
        int p = Integer.parseInt(sc.nextLine());
        while(p-- > 0){
            String[] inp = sc.nextLine().split(" ");
            BangDiem a = new BangDiem(inp[0], inp[1], inp[2]);
            lst.add(a);
        }
        lst.sort((a,b) -> Double.valueOf(a.getRes()).compareTo(Double.valueOf(b.getRes())) == 0 ? a.getIdStud().compareTo(b.getIdStud()) : Double.valueOf(b.getRes()).compareTo(Double.valueOf(a.getRes())));
        int q = Integer.parseInt(sc.nextLine());
        while(q-- > 0){
            String idSub = sc.nextLine();
            System.out.printf("BANG DIEM MON %s:\n", lstSub.get(idSub).getName());
            for(BangDiem i : lst){
                if(i.getIdSub().equals(idSub)){
                    System.out.println(i.getIdStud() + " " + lstStud.get(i.getIdStud()).getNameStud() + " " + lstStud.get(i.getIdStud()).getGrade() + " " + i.getRes());
                }
            }
        }
    }
    
}
