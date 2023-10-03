
import java.text.ParseException;

public class Atheles implements Comparable<Atheles>{
    private int id, ord;
    private String name, real, bonus, last, birth;
    private long during, timeBonus, result;
    public Atheles(String name, String birth, String start, String end) throws ParseException{
        this.name = name;
        this.birth = birth;
        this.during = time(end) - time(start);
        this.timeBonus = calBonus(birth);
        this.result = this.during - this.timeBonus;
        this.real = formatTime(during);
        this.bonus = formatTime(timeBonus);
        this.last = formatTime(result);
    }
    public long time(String time){
        String[] a = time.split(":");
        long res = 0L;
        res += Long.parseLong(a[0]) * 3600 + Long.parseLong(a[1]) * 60 + Long.parseLong(a[2]);
        return res;
    }
    public int calBonus(String birth){
        int dis = 2021 - Integer.parseInt(birth.substring(6));
        if(dis >= 32)return 3;
        else if(dis >= 25)return 2;
        else if(dis >= 18)return 1;
        else return 0;
    }
    public String formatTime(long time){
        long hour = time / 3600;
        long minute = time / 60;
        long second = time % 60;
        StringBuilder sb = new StringBuilder("");
        sb.append(String.format("%02d:", hour)).append(String.format("%02d:", minute)).append(String.format("%02d", second));
        return sb.toString();
    }
    public void setId(int id){
        this.id = id;
    }
    public void setOrd(int ord){
        this.ord = ord;
    }
    public long getResult(){
        return this.result;
    }
    @Override
    public int compareTo(Atheles b){
        return (int) (this.result - b.result);
    }
    @Override
    public String toString(){
        return String.format("VDV%02d %s %s %s %s %d", id, name, real, bonus, last, ord);
    }
}
