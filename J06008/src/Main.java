
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        HashMap<String, Subject> lstSub = new HashMap<>();
        while(n-- > 0){
            String inp = sc.nextLine();
            int idx = inp.indexOf(' ');
            String id = inp.substring(0,idx);
            String name = inp.substring(idx + 1);
            lstSub.put(id, new Subject(id, name));
        }
        int m = Integer.parseInt(sc.nextLine());
        ArrayList<Teacher> lstTeach = new ArrayList<>();
        while(m-- > 0){
            String inp = sc.nextLine();
            int idx = inp.indexOf(' ');
            String id = inp.substring(0, idx);
            String name = inp.substring(idx + 1);
            lstTeach.add(new Teacher(id, name));
        }
        int p = Integer.parseInt(sc.nextLine());
        HashMap<String, Teacher> Teach = new HashMap<>();
        while(p-- > 0){
            String[] inp = sc.nextLine().split(" ");
            for(Teacher i : lstTeach)if(i.getId().equals(inp[0])){
                if(Teach.containsKey(inp[0])){
                    Subject x = new Subject(lstSub.get(inp[1]).getId(), lstSub.get(inp[1]).getName());
                    Teach.get(inp[0]).addSubject(x);
                    for(Subject j : Teach.get(inp[0]).getLst()){
                        if(j.getId().equals(inp[1]))j.addHours(Double.parseDouble(inp[2]));
                    }
                }
                else{
                    Teacher a = new Teacher(inp[0], i.getName());
                    Subject x = new Subject(lstSub.get(inp[1]).getId(), lstSub.get(inp[1]).getName());
                    a.addSubject(x);
                    for(Subject j : a.getLst()){
                        if(j.getId().equals(inp[1]))j.addHours(Double.parseDouble(inp[2]));
                    }
                    Teach.put(inp[0], a);
                }
                Teach.get(inp[0]).addHours(Double.parseDouble(inp[2]));
            }
        }
        String idGV = sc.nextLine();
        System.out.print("Giang vien: ");
        for(Teacher i : lstTeach)if(i.getId().equals(idGV))System.out.println(i.getName());
        for(Subject i : Teach.get(idGV).getLst()){
            System.out.println(i);
        }
        System.out.printf("Tong: %.2f\n", Teach.get(idGV).getHours());
    }
    
}
