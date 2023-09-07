
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("DATA.in")); 
        ArrayList<Integer> lst = (ArrayList<Integer>)os.readObject();
        int[] f = new int[1001];
        for(Integer i : lst)f[i]++;
        for(int i = 0; i <= 1000; ++i)System.out.println(i + " " + f[i]);
    }
    
}
