
import java.util.Scanner;

public class Main {
    public static String model="02468";
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            String n = sc.nextLine();
            if(check(n) == true)System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static Boolean check(String n){
        int l = 0, r = n.length() - 1;
        while(l < r){
            if(n.charAt(l) != n.charAt(r) || model.contains(String.valueOf(n.charAt(l))) == false || model.contains(String.valueOf(n.charAt(r))) == false)return false;
            l++;
            r--;
        }
        return true;
    }
}
