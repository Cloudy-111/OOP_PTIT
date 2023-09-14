
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("BANGDIEM.in"));
        ArrayList<Student> lst = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; ++i){
            Student a = new Student(sc.nextLine(), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            a.setId(i);
            lst.add(a);
        }
        Collections.sort(lst);
        int cnt = 1, diff = 1;
        lst.get(0).setRank(1);
        for(int i = 1; i < lst.size(); ++i){
            if(lst.get(i).getAve() != lst.get( i - 1).getAve()){
                lst.get(i).setRank(lst.get( i - 1).getRank() + diff);
                diff = 1;
            }
            else {
                lst.get(i).setRank(lst.get( i - 1).getRank());
                diff++;
            }
        }
        for(Student i : lst){
            System.out.println(i);
        }
    }
    
}
