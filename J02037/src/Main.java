
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            String[] a = sc.nextLine().split(" ");
            if(check(a))System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static Boolean check(String[] a){
        int even = 0, odd = 0;
        for(String i : a)
            if(Integer.parseInt(i) % 2 == 0)even++;
            else odd++;
        return (a.length % 2 == 0 && even > odd) || (a.length % 2 == 1 && odd > even);
    }
}
