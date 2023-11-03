package test;
//phải thêm package test vào để AC, còn không thì toàn bị IR
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream inputStream = new FileInputStream("DATA.in");
        ObjectInputStream ois = new ObjectInputStream(inputStream);
        ArrayList<Pair> list = (ArrayList<Pair>)ois.readObject();
        LinkedHashSet<Pair> set = new LinkedHashSet<>();
        for(int i = 0; i < list.size(); i++){
            int x1 = list.get(i).getFirst();
            int x2 = list.get(i).getSecond();
            if(x1 <  x2 && UCLN(x1, x2) == 1){
                set.add(new Pair(list.get(i).getFirst(), list.get(i).getSecond()));
            }
        }
        ArrayList<Pair> res = new ArrayList<>(set);
        Collections.sort(res);
        for(Pair x : res){
            System.out.println(x);
        }
    }
    
    public static int UCLN(int a, int b){
        while(b != 0){
            int tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
}