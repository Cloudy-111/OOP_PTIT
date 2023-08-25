
import java.util.Scanner;

public class Main {
//Xâu con dài nhất của 1 xâu là chính nó. Nếu xâu A = B, thì trả về -1, còn không thì trả về độ dài lớn nhất giữa 2 xâu
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            String a = sc.next();
            String b = sc.next();
            if(a.equals(b))System.out.println(-1);
            else System.out.println(Integer.max(a.length(), b.length()));
        }
    }
}