
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ObjectInputStream os1 = new ObjectInputStream(new FileInputStream("DATA1.in")), os2 = new ObjectInputStream(new FileInputStream("DATA2.in"));
        ArrayList<Integer> lst1 = (ArrayList<Integer>)os1.readObject();
        ArrayList<Integer> lst2 = (ArrayList<Integer>)os2.readObject();
        Set<Integer> s1 = new TreeSet<>(lst1);
        Set<Integer> s2 = new TreeSet<>(lst2);
        Map<Integer, Integer> m1 = new HashMap<>();
        Map<Integer, Integer> m2 = new HashMap<>();
        for(Integer i : lst1)
            if(m1.containsKey(i))m1.put(i, m1.get(i) + 1);
            else m1.put(i, 1);
        for(Integer i : lst2)
            if(m2.containsKey(i))m2.put(i, m2.get(i) + 1);
            else m2.put(i, 1);
        for(Integer i : s1)
            if(s2.contains(i))
                if(isPrime(i))
                    System.out.println(i + " " + m1.get(i) + " " + m2.get(i));
    }
    public static Boolean isPrime(int n){
        if(n < 2)return false;
        if(n == 2 || n == 3)return true;
        if(n % 2 == 0 || n % 3 == 0)return false;
        int i = 5;
        while(i * i <= n){
            if(n % i == 0 || n % (i + 2) == 0)return false;
            i += 6;
        }
        return true;
    }
}
