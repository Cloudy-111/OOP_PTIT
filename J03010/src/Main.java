
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static String gmailTail = "@ptit.edu.vn"; 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        Map<String, Integer> m = new HashMap<>();
        while(t-- != 0){
            String n = sc.nextLine();
            n = n.toLowerCase().trim();
            System.out.println(standard(n, m));
        }
    }
    public static String standard(String n, Map<String, Integer> m){
        String[] arr = n.split(" ");
        StringBuilder sb = new StringBuilder(arr[arr.length - 1]);
        for(int i = 0; i < arr.length - 1; ++i){
            if(!arr[i].isEmpty())sb.append(arr[i].charAt(0));
        }
        m.put(sb.toString(), m.getOrDefault(sb.toString(),0) + 1);
        if(m.get(sb.toString()) > 1)sb.append(m.get(sb.toString()));
        sb.append(gmailTail);
        return sb.toString();
    }
}
