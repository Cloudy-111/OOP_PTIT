
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static boolean palin(String s){
        int left =  0, right = s.length() - 1;
        while(left < right){
            if (s.charAt(left) != s.charAt(right))return false;
            left ++; right --;
        }
        return true;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lst = new ArrayList<>();
        int maxLen = 0;
        while(sc.hasNextLine()){
            String[] words = sc.nextLine().trim().split(" ");
            for(String i : words){
                if(palin(i)){
                    lst.add(i);
                    maxLen = Math.max(maxLen, i.length());
                }
            }
        }
        HashMap<String, Integer> m = new HashMap<>();
        for(String i : lst){
            if(m.get(i) == null && i.length() == maxLen){
                System.out.println(i + " " + Collections.frequency(lst, i));
                m.put(i, 1);
            }
        }
    }
    
}
