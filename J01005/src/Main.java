import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n= sc.nextInt();
            double h = sc.nextDouble();
            for(int i = 1; i < n; i++)System.out.print(String.format("%.6f ", height(n,h,i)));
            System.out.println();
        }
        
    }
    
    public static double height(int n, double h, int i){
        return Math.sqrt((double)i/n)*h;
    }
    
}
