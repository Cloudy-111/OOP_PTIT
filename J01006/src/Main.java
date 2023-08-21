import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        long[] a = new long[94];
        a[0] = 0; a[1] = 1;
        for(int i = 2; i <= 93; ++i)a[i] = a[i - 1] + a[i - 2];
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            System.out.println(a[n]);
        }
    }
    
}
