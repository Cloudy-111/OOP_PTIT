
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("XETTUYEN.in"));
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; ++i){
            Student a = new Student(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), Double.parseDouble(sc.nextLine()));
            a.setId(i);
            System.out.println(a);
        }
    }
    
}
