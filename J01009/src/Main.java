import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        long mul = 1;
        int n = sc.nextInt();
        long res = 0;
        for(int i = 1; i <= n; ++i){
            mul *= i;
            res += mul;
        }
        System.out.println(res);
    }
    
}
