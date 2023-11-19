
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Schedule implements Comparable<Schedule>{
    private Subject sub;
    private CaThi cathi;
    private String idCathi, idSub, group;
    private int num;
    static ArrayList<Subject> lstSub = new ArrayList<>();
    static ArrayList<CaThi> lstCathi = new ArrayList<>();
    
    public Schedule(String idCathi, String idSub, String group, int num){
        for(CaThi i : lstCathi)if(i.getId().equals(idCathi))cathi = i;
        for(Subject i : lstSub)if(i.getIdSub().equals(idSub))sub = i;
        this.group = group;
        this.num = num;
    }
    
    public static void addSub(Subject a){
        lstSub.add(a);
    }
    
    public static void addCathi(CaThi a){
        lstCathi.add(a);
    }
    
    @Override
    public int compareTo(Schedule b){
        SimpleDateFormat sf = new SimpleDateFormat("hh:mm dd/MM/yyyy");
        String time1 = this.cathi.getHour() + " " + this.cathi.getDate();
        String time2 = b.cathi.getHour() + " " + b.cathi.getDate();
        try {
            String t1 = Long.toString(sf.parse(time1).getTime());
            String t2 = Long.toString(sf.parse(time2).getTime());
            if(t1.equals(t2))return this.cathi.getId().compareTo(b.cathi.getId());
            else return t1.compareTo(t2);
        } catch (ParseException e) {
        }
        return 0;
    }
    
    @Override
    public String toString(){
        return cathi + " " + sub.getNameSub() + " " + group + " " + num;
    }
}
