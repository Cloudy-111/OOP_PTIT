
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            String s = sc.nextLine();
            solve(s);
        }
    }
    public static void solve(String s){
        int mid = s.length() / 2;
        String left = rotate(s.substring(0, mid));
        String right = rotate(s.substring(mid));
        //System.out.println(left + " " + right);
        System.out.println(merge(left, right));
    }
    public static String rotate(String s){
        int sum = 0;
        for(int i = 0; i < s.length(); ++i)sum += s.charAt(i) - 'A';
        String res = "";
        for(int i = 0; i < s.length(); ++i)res += (char)((s.charAt(i) + sum - 65) % 26 + 65);
        return res;
    }
    public static String merge(String a, String b){
        String res = "";
        for(int i = 0; i < a.length(); ++i)res += (char)(((a.charAt(i) + b.charAt(i)) - 65 - 65) % 26 + 65);
        return res;
    }
}
