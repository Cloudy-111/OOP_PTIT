
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Group> lst = new ArrayList<>();
        while(n-- > 0){
            Group.addStud(new Student(sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        sc.close();
        Scanner sc1 = new Scanner(new File("BAITAP.in"));
        int m = Integer.parseInt(sc1.nextLine());
        while(m-- > 0){
            Group.addBTL(new BTL(sc1.nextLine()));
        }
        sc1.close();
        Scanner sc2 = new Scanner(new File("NHOM.in"));
        while(sc2.hasNextLine()){
            String[] inp = sc2.nextLine().split(" ");
            lst.add(new Group(inp[0], inp[1]));
        }
        Collections.sort(lst);
        for(Group i : lst){
            System.out.println(i);
        }
    }
    
}
