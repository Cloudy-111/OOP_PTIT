
import java.util.*;

public class Main {
    public static int[] moveX = {1,2,2,1,-1,-2,-2,-1}; 
    public static int[] moveY = {2,1,-1,-2,-2,-1,1,2}; 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        while(n-- > 0){
            Queue<Pair<String, Integer>> q = new LinkedList<Pair<String, Integer>>();
            String[] inp = sc.nextLine().split(" ");
            String start = inp[0], end = inp[1];
            Pair a = new Pair<>(start, 0);
            q.offer(a);
            HashSet<String> set = new HashSet<>();
            while(!q.isEmpty()){
                Pair x = q.poll();
                if(x.getFirst().equals(end)){
                    System.out.println(x.getSecond());
                    break;
                }
                String point = x.getFirst().toString();
                int sec = Integer.parseInt(x.getSecond().toString());
                for(int i = 0; i < 8; i++){
                    int newX = point.charAt(0) - 'a' + moveX[i];
                    int newY = point.charAt(1) - '1' + moveY[i];
                    if(newX >= 0 && newX < 8 && newY >= 0 && newY < 8){
                        StringBuilder newP = new StringBuilder();
                        newP.append((char)(newX + 'a')).append(newY + 1);
                        if(!set.contains(newP.toString()))q.offer(new Pair<>(newP.toString(), sec + 1));
                        else set.add(newP.toString());
                    }
                }
            }
        }
    }
    
}
