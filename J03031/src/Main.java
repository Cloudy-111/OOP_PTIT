
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            String s = sc.nextLine();
            int k = Integer.parseInt(sc.nextLine());
            if(solve(s, k))System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static Boolean solve(String s, int k){
        Set<Character> st = new HashSet<>();
        for(int i = 0; i < s.length(); ++i)st.add(s.charAt(i));
        if(s.length() >= 26 && k >= 26 - st.size())return true;
        return false;
    }
    
}
