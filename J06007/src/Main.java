
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Subject> lstSub = new ArrayList<>();
        while(n-- > 0){
            String inp = sc.nextLine();
            int idx = inp.indexOf(' ');
            String id = inp.substring(0,idx);
            String name = inp.substring(idx + 1);
            lstSub.add(new Subject(id, name));
        }
        sc.close();
        sc = new Scanner(new File("GIANGVIEN.in"));
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Teacher> lstTeach = new ArrayList<>();
        while(m-- > 0){
            String inp = sc.nextLine();
            int idx = inp.indexOf(' ');
            String id = inp.substring(0, idx);
            String name = inp.substring(idx + 1);
            lstTeach.add(new Teacher(id, name));
        }
        sc.close();
        sc = new Scanner(new File("GIOCHUAN.in"));
        int p = Integer.parseInt(sc.nextLine());
        while(p-- > 0){
            String[] inp = sc.nextLine().split(" ");
            for(Teacher i : lstTeach)if(i.getId().equals(inp[0]))i.addHours(Double.parseDouble(inp[2]));
        }
        sc.close();
        for(Teacher i : lstTeach){
            System.out.println(i);
        }
    }
    
}