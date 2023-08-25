
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            String s = sc.next();
            s = s.toLowerCase();
            StringBuilder ans = new StringBuilder();
            for(int i = 0; i < s.length(); ++i)ans.append(appear(s.charAt(i)));
            if(palin(ans.toString()) == true)System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static Boolean palin(String s){
        int l = 0, r = s.length() - 1;
        while(l < r){
            if(s.charAt(l) != s.charAt(r))return false;
            l++;
            r--;
        }
        return true;
    }
    public static int appear(char x){
        if("abc".contains(String.valueOf(x)))return 2;
        else if("def".contains(String.valueOf(x)))return 3;
        else if("ghi".contains(String.valueOf(x)))return 4;
        else if("jkl".contains(String.valueOf(x)))return 5;
        else if("mno".contains(String.valueOf(x)))return 6;
        else if("pqrs".contains(String.valueOf(x)))return 7;
        else if("tuv".contains(String.valueOf(x)))return 8;
        else if("wxyz".contains(String.valueOf(x)))return 9;
        else return 0;
    }
}
