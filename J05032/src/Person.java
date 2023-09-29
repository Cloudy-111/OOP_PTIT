
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements Comparable<Person>{
    private String name;
    private Date date;
    public Person(String name, String date) throws ParseException{
        this.name = name;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        this.date = df.parse(date);
    }
    @Override
    public int compareTo(Person b){
        return (int)((b.date.getTime() - this.date.getTime()) / 100000);
    }
    @Override
    public String toString(){
        return name;
    }
}
