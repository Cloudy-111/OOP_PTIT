
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            TreeSet<String>s = new TreeSet<>();
            TreeSet<String>x = new TreeSet<>();
            String a = sc.nextLine();
            String b = sc.nextLine();
            
            String[] sb = b.split(" ");
            for(int i = 0; i < sb.length; ++i)s.add(sb[i]);
            String[] sa = a.split(" ");            
            for(int i = 0; i < sa.length; ++i)if(!s.contains(sa[i]))x.add(sa[i]);
            for(String i : x)System.out.print(i + " ");
            System.out.println();
        }
    }
    
}
