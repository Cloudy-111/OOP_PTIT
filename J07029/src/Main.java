
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
        int[] prime = new int[1000005];
        for(Integer i : lst)if(isPrime(i))prime[i]++;
        int cnt = 1;
        for(int i = 1000001; i >= 2; --i)if(prime[i] > 0 && cnt <= 10){
            System.out.println(i + " " + prime[i]);
            cnt += 1;
        }
    }
    public static Boolean isPrime(int a){
        if(a < 2)return false;
        if(a == 2 || a == 3)return true;
        if(a % 2 == 0 || a % 3 == 0 )return false;
        int i = 5;
        while(i * i <= a){
            if(a % i == 0 || a % (i + 2) == 0)return false;
            i += 6;
        }
        return true;
    }
}
