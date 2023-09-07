
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordSet {
    private Set<String> set = new TreeSet<>();
    public WordSet(String s) throws FileNotFoundException{
        Scanner sc = new Scanner(new File("VANBAN.in"));
        while(sc.hasNext()){
            this.set.add(sc.next().toLowerCase());
        }
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder("");
        for(String i : set){
            sb.append(i).append('\n');
        }
        return sb.toString();
    }
}
