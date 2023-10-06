
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class WordSet {
    private ArrayList<String> lst = new ArrayList<>();
    public int size;
    public WordSet(String path_file) throws FileNotFoundException{
        Scanner sc = new Scanner(new File(path_file));
        Set<String> s = new TreeSet<>();
        while(sc.hasNext())s.add(sc.next().toLowerCase());
        for(String i : s)lst.add(i);
    }
    public int getSize(){
        return this.size;
    }
    public ArrayList getArray(){
        return this.lst;
    }
    public String difference(WordSet b){
        ArrayList<String> tmp = b.getArray();
        String res = "";
        for(String i : this.lst)if(!tmp.contains(i))res += i + " ";
        return res;
    }
}
