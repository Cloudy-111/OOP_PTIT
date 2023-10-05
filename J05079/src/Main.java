
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Section> lst = new ArrayList<>();
        HashMap<String, String> m = new HashMap<>();
        while(t-- != 0){
            Section a = new Section(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            lst.add(a);
            m.put(a.getId(), a.getName());
        }
        Collections.sort(lst);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- != 0){
            String s = sc.nextLine();
            System.out.println("Danh sach nhom lop mon " + m.get(s) + ":");
            for(Section i : lst)if(s.equals(i.getId()))System.out.println(i);
        }
    }
    
}
