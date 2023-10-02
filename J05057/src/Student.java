
import java.text.DecimalFormat;

public class Student {
    private String id, name, stat;
    private Double p1, p2, p3, sum, bonus;
    public Student(String id, String name, double p1, double p2, double p3){
        this.id = id;
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.bonus = calBonus(id);
        this.sum = p1 + p1 + p2 + p3 + this.bonus;
    }
    public double calBonus(String id){
        String s = id.substring(0,3);
        if(s.equals("KV1"))return 0.5;
        else if(s.equals("KV2"))return 1.0;
        else return 2.5;
    }
    public double getSum(){
        return this.sum;
    }
    public void setStat(String s){
        this.stat = s;
    }
    public String getId(){
        return this.id;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + (new DecimalFormat().format(bonus)) + " " + (new DecimalFormat().format(sum - bonus)) + " " + stat;
    }
}
