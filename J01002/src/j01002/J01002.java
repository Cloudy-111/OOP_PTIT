
package j01002;
import java.util.Scanner;

public class J01002 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            System.out.println((long)n*(n+1)/2);
        }
    }
    
}
