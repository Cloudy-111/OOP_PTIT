
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class WordSet {
    private ArrayList<String> array = new ArrayList<>();
    public WordSet(String s){
        s = s.toLowerCase();
        String[] a = s.split(" ");
        Set<String> ts = new TreeSet<>();
        for(int i = 0; i < a.length; ++i)
            if(!a[i].isEmpty())ts.add(a[i]);
        for(String i : ts)this.array.add(i);
    }
    public ArrayList getArray(){
        return array;
    }
    public WordSet union(WordSet b){
        Set<String> ts = new TreeSet<>(b.getArray());
        for(String i : this.array)ts.add(i);
        String res = "";
        for(String i : ts)res += i + " ";
        return new WordSet(res);
    }
    public WordSet intersection(WordSet b){
       Set<String> ts = new TreeSet<>(b.getArray());
       String res = "";
       for(String i : this.array)if(ts.contains(i))res += i + " ";
       return new WordSet(res);
    }
    @Override
    public String toString(){
        String res = "";
        for(String i : array)res += i + " ";
        return res;
    }
}
