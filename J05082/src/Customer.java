
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements Comparable<Customer>{
    private String name, sex, address, birthString;
    private int id;
    private Date birth;
    public Customer(String name, String sex, String birth, String address) throws ParseException{
        this.name = standardName(name);
        this.sex = sex;
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        this.birthString = standardBirth(birth);
        this.birth = sd.parse(birthString);
        this.address = address;
    }
    public String standardName(String name){
        String[] a = name.trim().split(" ");
        String res = "";
        for(int i = 0; i < a.length; ++i)if(!a[i].isEmpty()){
            res += a[i].substring(0,1).toUpperCase() + a[i].substring(1).toLowerCase();
            if(i != a.length - 1)res += " ";
        }
        return res;
    }
    public String standardBirth(String birth){
        String[] a = birth.split("/");
        String res = "";
        for(int i = 0; i < a.length; ++i){
            if(a[i].length() == 1)res += "0" + a[i];
            else res += a[i];
            if(i != a.length - 1)res += "/";
        }
        return res;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public int compareTo(Customer b){
        return this.birth.compareTo(b.birth);
    }
    @Override
    public String toString(){
        return String.format("KH%03d %s %s %s %s", id, name, sex, address, birthString);
    }
}
