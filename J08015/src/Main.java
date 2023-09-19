import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            sc.nextLine();
            String[] s = sc.nextLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int k = Integer.parseInt(s[1]);
            ArrayList<Long> lst = new ArrayList<>();
            for(int i = 0; i < n; ++i)lst.add(sc.nextLong());
            Map<Long, Long> m = new HashMap<>();
            for(Long i : lst){
                if(m.containsKey(i))m.put(i, m.get(i) + 1);
                else m.put(i, 1L);
            }
            long res = 0;
            for(Map.Entry<Long, Long> entry : m.entrySet()){
                Long key = entry.getKey();
                Long value = entry.getValue();
                if(key * 2 == k)res += value * (value - 1);
                else{
                    if(m.containsKey(k - key)){
                        res += value * m.get(k - key);
                    }
                }
            }
            res /= 2;
            System.out.println(res);
        }
    }
    
}
