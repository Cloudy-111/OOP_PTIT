import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            if(isPrime(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    
    public static Boolean isPrime(int n){
        if(n < 2) return  false;
        else if(n == 2 || n == 3)return true;
        else if(n % 2 == 0 || n % 3 == 0)return false;
        int i = 5;
        while(i * i <= n){
            if(n % i == 0 || n % (i + 2) == 0)return false;
            i += 6;
        }
        return true;
    }
    
}
