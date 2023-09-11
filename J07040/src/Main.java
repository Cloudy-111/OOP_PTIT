
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.LinkedHashSet ;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("NHIPHAN.in"));
        ArrayList<String> lst = (ArrayList<String>)os.readObject();
        Set<String> s1 = new LinkedHashSet <>();
        for(String i : lst){
            String[] s = i.split(" ");
            for(int j = 0; j < s.length; ++j)if(!s[j].isEmpty())s1.add(s[j].toLowerCase());
        }
        Scanner sc = new Scanner(new File("VANBAN.in"));
        Set<String> s2 = new LinkedHashSet <>();
        Set<String> res = new LinkedHashSet <>();
        while(sc.hasNextLine()){
            String[] s = sc.nextLine().split(" ");
            for(int j = 0; j < s.length; ++j)if(!s[j].isEmpty())s2.add(s[j].toLowerCase());
        }
        for(String i : s2)
            if(s1.contains(i))res.add(i);
        for(String i : res)
            System.out.println(i);
    }
    
}
