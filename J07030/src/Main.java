import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static final int X = 1000000;

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ArrayList<Integer> lst1 = (ArrayList<Integer>)os1.readObject();
        os1 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> lst2 = (ArrayList<Integer>)os1.readObject();
        Collections.sort(lst1);
        int[] f = new int[1000005];
        for(Integer i : lst1){
            if(f[i] == 0 && isPrime(i)){
                int j = X - i;
                if(isPrime(j))
                    if(lst2.contains(j) && i < j){
                        System.out.println(i + " " + j);
                        f[i] = 1;
                        f[j] = 1;
                    }
            }
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