
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), s = sc.nextInt();
        String r = "";
        while(s >= 9){
            s -= 9;
            r += '9';
        }
        r += (char)(s + '0');
        while(r.length() < n)r += '0';
        if(!r.isEmpty() && r.length() == n && s != 0){
            while(r.length() < n)r += '0';
            String l = "";
            if(r.charAt(r.length() - 1) == '0'){
                l += '1';
                for(int i = r.length() - 2; i >= 0; --i){
                    if(r.charAt(i) != '0' && r.charAt(i + 1) == '0')l += ((char)((int)r.charAt(i) - 1));
                    else l += r.charAt(i);
                }
            }
            else for(int i = r.length() - 1; i >= 0; --i)l += r.charAt(i);
            System.out.println(l + " " + r);
        }
        else System.out.println("-1 -1");
    }
    
}
