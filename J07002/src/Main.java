import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        long res = 0;
        while(sc.hasNext()){
            String str = sc.next();
            try {
                res += Integer.parseInt(str);//cộng những cái số thuộc int
            } catch (Exception e) {
            }
        }
        System.out.println(res);
    }
    
}