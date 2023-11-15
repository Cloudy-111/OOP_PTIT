import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("VANBAN.in"));
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<String> lst = new ArrayList<>();
        Map<String, Integer> m = new HashMap<>();
        while(t-- > 0){
            String[] inp = sc.nextLine().toLowerCase().split("[ ,.?!:;()-/]");
            for(String i : inp){
                if(!i.isEmpty() && !checkRegexString(i)){
                    if(m.containsKey(i))m.put(i, m.get(i) + 1);
                    else {
                        m.put(i, 1);
                        lst.add(i);
                    }
                }
            }
        }
        lst.sort(new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                if(m.get(a).equals(m.get(b)))return a.compareTo(b);
                else return m.get(b) - m.get(a);
            }
        });
        for(String i : lst){
            System.out.println(i + " " + m.get(i));
        }
    }
    
    public static Boolean checkRegexString(String s){
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher(s);

        return matcher.find();
    }
    
}