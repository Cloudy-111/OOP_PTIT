import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        String s = sc.nextLine();
        if(s.length() == 1)System.out.println(s);
        while(s.length() > 1){
            s = cal(s);
            System.out.println(s);               
        }
    }
    public static String cal(String s){
        int mid = s.length() / 2;
        BigInteger s1 = new BigInteger(s.substring(0,mid));
        BigInteger s2 = new BigInteger(s.substring(mid));
        return s1.add(s2).toString();
    }
}