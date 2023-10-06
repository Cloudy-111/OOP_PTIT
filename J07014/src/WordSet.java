
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class WordSet {
    private ArrayList<String> lst = new ArrayList<>();
    public WordSet(String pathFile) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(pathFile));
        Set<String> s = new TreeSet<>();
        while(sc.hasNext()){
            String tmp = sc.next().toLowerCase();
            s.add(tmp);
        }
        for(String i : s)this.lst.add(i);
    }
    public ArrayList getArray(){
        return this.lst;
    }
    public String union(WordSet b){
        Set<String> s = new TreeSet<>(b.getArray());
        for(String i : this.lst)s.add(i);
        String res = "";
        for(String i : s)res += i + " ";
        return res;
    }
    public String intersection(WordSet b){
        Set<String> s = new TreeSet<>(b.getArray());
        String res = "";
        for(String i : s)if(this.lst.contains(i))res += i + " ";
        return res;
    }
}
