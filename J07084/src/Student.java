
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable<Student>{
    private String name;
    private long during;
    public Student(String name, String st, String fi){
        this.name = name;
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        try{
            Date datest = sd.parse(st);
            Date datefi = sd.parse(fi);
            this.during = datefi.getTime() - datest.getTime();
            this.during /= (1000 * 60);
        } catch(ParseException e){
            e.printStackTrace();
        }
    }
    @Override
    public int compareTo(Student b){
        if(this.during != b.during)return (int)(b.during - this.during);
        else return name.compareTo(b.name);
    }
    @Override
    public String toString(){
        return name + " " + during;
    }
}
