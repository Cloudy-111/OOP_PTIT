
import java.util.ArrayList;

public class Group implements Comparable<Group>{
    private String idBTL, idStudent;
    private Student stud;
    private BTL BTL;
    static ArrayList<Student> lstStud = new ArrayList<>();
    static ArrayList<BTL> lstBTL = new ArrayList<>();
    
    public Group(String idStud, String idBTL){
        for(Student i : lstStud)if(i.getId().equals(idStud))this.stud = i;
        for(BTL i : lstBTL)if(i.getId().equals(idBTL))this.BTL = i;
    }
    
    public static void addStud(Student a){
        lstStud.add(a);
    }
    
    public static void addBTL(BTL a){
        lstBTL.add(a);
    }
    
    @Override
    public int compareTo(Group b){
        return this.stud.getId().compareTo(b.stud.getId());
    }
    
    @Override
    public String toString(){
        return stud.getId() + " " + stud.getName() + " " + stud.getPhone() + " " + BTL.getId() + " " + BTL.getName();
    }
}
