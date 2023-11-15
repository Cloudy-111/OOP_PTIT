
import java.util.ArrayList;

public class Teacher{
    private String id, name;
    private double hours;
    private ArrayList<Subject> lstSub = new ArrayList<>();
    
    public Teacher(String id, String name){
        this.id = id;
        this.name = name;
    }
    public void addHours(double hour){
        this.hours += hour;
    }
    public double getHours(){
        return this.hours;
    }
    public ArrayList<Subject> getLst(){
        return this.lstSub;
    }
    public void setLst(ArrayList<Subject> a){
        this.lstSub = a;
    }
    public void addSubject(Subject a){
        lstSub.add(a);
    }
    public String getName(){
        return this.name;
    }
    public String getId(){
        return this.id;
    }
}
