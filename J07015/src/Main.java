
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("SONGUYEN.in"));
        ArrayList<Integer> lst = (ArrayList<Integer>)os.readObject();
        int[] f = new int[10001];
        for(Integer i : lst)if(isPrime(i) == true)f[i]++;
        for(int i = 2; i <= 10001; ++i)if(f[i] > 0)System.out.println(i + " " + f[i]);
    }
    
    public static Boolean isPrime(int a){
        if(a < 2) return false;
        if(a == 2 || a == 3)return true;
        if(a % 2 == 0 || a % 3 == 0)return false;
        int i = 5;
        while(i * i <= a){
            if(a % i == 0 || a % (i + 2) == 0)return false;
            i += 6;
        }
        return true;
    }
    
}
