
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<Pair<Integer, Integer>> lst = new ArrayList<>();
        while(t-- != 0){
            sc.nextLine();
            lst.add(new Pair<>(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(lst, new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> pair1, Pair<Integer, Integer> pair2) {
                // So sánh theo giá trị Integer đầu tiên
                return pair1.getFirst().compareTo(pair2.getFirst());
            }
        });
        
        //for(Pair<Integer, Integer> i : lst)System.out.println(i.getFirst() + " " + i.getSecond());
        int res = 0;
        for(Pair<Integer, Integer> i : lst){
            res = Math.max(res, i.getFirst());
            res += i.getSecond();
        }
        System.out.print(res);
    }
}

