
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            String a = sc.nextLine();
            if(Divisible_11(a))System.out.println("1");
            else System.out.println("0");
        }
    }
    public static Boolean Divisible_11(String a){
        int odd = 0, even = 0;
        for(int i = 0; i < a.length(); i++){
            if(i % 2 == 0)even += a.charAt(i) - '0';
            else odd += a.charAt(i) - '0';
        }
        return (Math.abs(odd - even) % 11 == 0);
    }
}
