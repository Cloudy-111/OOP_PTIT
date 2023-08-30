import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> times = new ArrayList<>();
        while(n-- != 0){
            Time time = new Time(sc.nextInt(), sc.nextInt(), sc.nextInt());
            times.add(time);
        }
        Collections.sort(times);
        // Vì Collections chỉ sắp xếp những Object nào Comparable. 
        //Nên Object times cần kế thừa từ Interface Comparable và ghi đè phương thức compareTo theo cách sắp xếp của mình
        for(Time x : times){
            System.out.println(x);
        }
    }
}