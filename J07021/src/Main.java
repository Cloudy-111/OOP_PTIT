
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        while(sc.hasNextLine()){
            String s = sc.nextLine();
            if(s.equals("END"))break;
            System.out.println(standard(s));
        }
    }
    public static String standard(String s){
        String[] n = s.split(" ");
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < n.length; ++i)if(!n[i].isEmpty()){
            sb.append(n[i].substring(0,1).toUpperCase()).append(n[i].substring(1,n[i].length()).toLowerCase());
            if(i != n.length - 1)sb.append(" ");
        }
        return sb.toString();
    }
}
