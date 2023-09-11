
import java.util.Date;

public class Guess implements Comparable<Guess>{
    private int id;
    private String name, roomId;
    private Date inDay, outDay;
    private long stay;
    public Guess(String name, String roomId, Date inDay, Date outDay){
        this.name = name;
        this.roomId = roomId;
        this.inDay = inDay;
        this.outDay = outDay;
        this.stay = (outDay.getTime() - inDay.getTime()) / (1000L * 60 * 60 * 24);
    }
    public void setId(int id){
        this.id = id;
    }
    public long getStay(){
        return this.stay;
    }
    @Override
    public int compareTo(Guess b){
        return (int)(-this.stay + b.getStay());
    }
    @Override
    public String toString(){
        return String.format("KH%02d %s %s %d", id, name, roomId, stay);
    }
}
