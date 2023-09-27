
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            String a = sc.nextLine();
            System.out.println(solve(a));
        }
    }
    public static int solve(String s){
        ArrayList<Integer> lst = new ArrayList<>();
        for(int i = 0; i < s.length(); ++i)
            lst.add(filter(s.charAt(i)));
        int res = 0;
        for(int i = 0; i < lst.size() - 1; ++i){
            if(lst.get(i) < lst.get(i + 1))res -= lst.get(i);
            else res += lst.get(i);
        }
        return res + lst.get(lst.size() - 1);
        
    }
    public static int filter(char x){
        return switch (x) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            default -> 1000;
        };
    }
}
