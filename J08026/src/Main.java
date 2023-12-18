
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            Queue<Pair<Long, Long>> q = new LinkedList<Pair<Long, Long>>();
            String[] inp = sc.nextLine().split(" ");
            long s = Long.parseLong(inp[0]), t = Long.parseLong(inp[1]);
            Pair tmp = new Pair<>(s, 0l);
            q.offer(tmp);
            HashSet<Long> set = new HashSet<>();
            set.add((Long) tmp.getFirst());
            while(!q.isEmpty()){
                Pair a = q.poll();
                if(a.getFirst().equals(t)){
                    System.out.println(a.getSecond());
                    break;
                }
                else{
                    long first = Long.parseLong(a.getFirst().toString());
                    long second = Long.parseLong(a.getSecond().toString());
                    if(!set.contains(first - 1) && first > 0){
                        q.offer(new Pair<>(first - 1, second + 1));
                        set.add(first - 1);
                    }
                    if(!set.contains(first * 2) && first < t){
                        q.offer(new Pair<>(first * 2, second + 1));
                        set.add(first * 2);
                    }
                }
            }
        }
        
        
    }
    
}
