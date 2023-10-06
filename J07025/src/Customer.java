
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements Comparable<Customer>{
    private String name, address, sex;
    private Date birth;
    private int id;
    public Customer(String name, String sex, String birth, String address) throws ParseException{
        this.name = standard(name);
        this.sex = sex;
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        this.birth = sd.parse(birth);
        this.address = address;
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
    public int compareTo(Customer b){
        return this.birth.compareTo(b.birth);
    }
    @Override
    public String toString(){
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        return String.format("KH%03d %s %s %s", id, name, sex, address) + " " + sd.format(birth);
    }
}
