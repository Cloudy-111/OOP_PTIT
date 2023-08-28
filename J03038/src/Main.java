
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Set<Character>s = new HashSet<>();
        String n = sc.nextLine();
        for(int i = 0; i < n.length(); ++i)s.add(n.charAt(i));
        System.out.println(s.size());
    }
    
}
