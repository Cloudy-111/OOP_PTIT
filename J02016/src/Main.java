import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            ArrayList<Long> lst = new ArrayList<>();
            for(int i = 0; i < n; ++i){
                int tmp = sc.nextInt();
                lst.add((Long)1L * tmp * tmp);
            }
            Collections.sort(lst);
            String ans = "NO";
            for(int i = 0; i < n - 1; ++i){
                for(int j = i + 1; j < n; ++j){
                    Long sq = lst.get(i) + lst.get(j);
                    if(Collections.binarySearch(lst, sq) >= 0){
                        ans = "YES";
                        break;
                    }
                }
                if(ans.equals("YES"))break;
            }
            System.out.println(ans);
        }
    }
}