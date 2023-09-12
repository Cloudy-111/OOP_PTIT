
import java.util.Date;

public class Guess implements Comparable<Guess>{
    private String name, roomId;
    private Date inDay, outDay;
    private int id, bonus;
    private long stay, Total;
    public Guess(String name, String roomId, Date inDay, Date outDay, int bonus){
        this.name = standard(name);
        this.roomId = roomId.trim();
        this.inDay = inDay;
        this.outDay = outDay;
        this.bonus = bonus;
        this.stay = (outDay.getTime() - inDay.getTime()) / (1000L * 60 * 60 * 24) + 1L;
        this.Total = cost(roomId.substring(0,1)) * this.stay + bonus;
    }
    public void setId(int id){
        this.id = id;
    }
    public int cost(String s){
        if(s.equals("1"))return 25;
        else if(s.equals("2"))return 34;
        else if(s.equals("3"))return 50;
        else return 80;
    }
    public long getTotal(){
        return this.Total;
    }
    public String standard(String s){
        String[] n = s.split(" ");
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < n.length; ++i){
            if(!n[i].isEmpty()){
                sb.append(n[i].substring(0,1).toUpperCase()).append(n[i].substring(1,n[i].length()).toLowerCase());
                if(i != n.length - 1)sb.append(" ");
            }
        }
        return sb.toString();
    }
    @Override
    public int compareTo(Guess b){
        return (int)(b.getTotal() - this.Total);
    }
    @Override
    public String toString(){
        return String.format("KH%02d %s %s %d %d", id, name, roomId, stay, Total);
    }
}
