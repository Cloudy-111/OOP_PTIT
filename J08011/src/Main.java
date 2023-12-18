
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static boolean check(String s){
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) < s.charAt(i - 1))return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lst = new ArrayList<>();
        while(sc.hasNextLine()){
            String[] words = sc.nextLine().trim().split("\\s+");
            for(String i : words){
                if(check(i)){
                    lst.add(i);
                }
            }
        }
        Collections.sort(lst, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2){
                return Collections.frequency(lst, s2) - Collections.frequency(lst, s1);
            }
        });
        HashMap<String, Integer> m = new HashMap<>();
        for(String i : lst){
            if(m.get(i) == null){
                System.out.println(i + " " + Collections.frequency(lst, i));
                m.put(i, 1);
            }
        }
    }
    
}
