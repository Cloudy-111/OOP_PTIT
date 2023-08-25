
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(minus(a,b));
    }
    public static String minus(String a, String b){
        int chk = 0;
        while(a.length() < b.length())a = '0' + a;
        while(b.length() < a.length())b = '0' + b;
        //System.out.println(a + " " + b);
        if(a.compareTo(b) < 0){
            String tmp = a;
            a = b;
            b = tmp;
            chk = 1;
        }
        String res = "";
        int carry = 0;
        for(int i = a.length() - 1; i >= 0; --i){
            int x = a.charAt(i) - '0';
            int y = b.charAt(i) - '0' + carry;
            if(x < y){
                x += 10;
                carry = 1;
            }
            else carry = 0;
            int k = x - y;
            res = k + res;
        }
        StringBuilder ans = new StringBuilder(res);
        while(ans.charAt(0) == '0' && ans.length() > 1)ans.delete(0, 1);
        if(chk == 1)ans.insert(0, "-");
        return ans.toString();
    }
    
}
