
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("DATA.in"));
        ArrayList<String> lst = (ArrayList<String>)os.readObject();
        
        for(String i : lst){
            String tmp = comb(i);
            System.out.println(tmp + " " + sum(tmp));
        }
    }
    public static String comb(String s){
        StringBuilder res = new StringBuilder("");
        for(int i = 0; i < s.length(); ++i){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9')res.append(s.charAt(i));
        }
        while(res.charAt(0) == '0')res.deleteCharAt(0);
        return res.toString();
    }
    public static int sum(String s){
        int res = 0;
        for(int i = 0; i < s.length(); ++i)res += s.charAt(i) - '0';
        return res;
    }
    
}
