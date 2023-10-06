
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private int id;
    private String name, grade;
    private double GPA;
    private Date birth;
    public Student(String name, String grade, String birth, double GPA) throws ParseException{
        this.name = name;
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        this.birth = sd.parse(birth);
        this.name = standard(name);
        this.grade = grade;
        this.GPA = GPA;
    }
    public String standard(String name){
        String[] a = name.trim().split(" ");
        String res = "";
        for(int i = 0; i < a.length; ++i)if(!a[i].isEmpty()){
            res += a[i].substring(0,1).toUpperCase() + a[i].substring(1).toLowerCase();
            if(i != a.length - 1)res += " "; 
        }
        return res;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public String toString(){
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("B20DCCN%03d %s %s", id, name, grade) + " " + sd.format(birth) + " " + String.format("%.2f", GPA);
    }
}
