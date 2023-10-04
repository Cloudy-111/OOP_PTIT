
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Teacher> lst = new ArrayList<>();
        while(t-- != 0){
            Teacher a = new Teacher(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            lst.add(a);
        }
        int cntHT = 0, cntHP = 0;
        for(Teacher i : lst){
            if(i.getPosition().equals("HT") && cntHT < 1){
                System.out.println(i);
                cntHT++;
            }
            else if(i.getPosition().equals("HP") && cntHP < 2){
                System.out.println(i);
                cntHP++;
            }
            else if(i.getPosition().equals("GV"))System.out.println(i);
        }
    }
    
}
