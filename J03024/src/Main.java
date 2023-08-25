
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            String s = sc.next();
            switch (check(s)) {
                case -1:
                    System.out.println("INVALID");
                    break;
                case 1:
                    System.out.println("YES");
                    break;
                default:
                    System.out.println("NO");
            }
        }
    }
    public static int check(String s){
        if(s.charAt(0) == '0')return -1;
        int even = 0, odd = 0;
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) < '0' || s.charAt(i) > '9')return -1;
            else{
                int x = s.charAt(i) - '0';
                if(x % 2 == 0) even++;
                else odd++;
            }
        }
        if(s.length() % 2 == 1 && odd > even || s.length() % 2 == 0 && even > odd)return 1;
        return 0;
    }
    
}
