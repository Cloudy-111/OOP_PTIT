
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("KHACHHANG.in"));
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Guess> lst = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for(int i = 1; i <= t; ++i){
            Guess a = new Guess(sc.nextLine(), sc.nextLine(), df.parse(sc.nextLine()), df.parse(sc.nextLine()), Integer.parseInt(sc.nextLine()));
            a.setId(i);
            lst.add(a);
        }
        Collections.sort(lst);
        for(Guess i : lst)System.out.println(i);
    }
}
