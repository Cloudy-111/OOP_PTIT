
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Customer{
    static int idx = 1;
    private String nameCus, roomId;
    private String id;
    private long days;
    private double Total;
    private Room room;

    public Customer(Room room, String nameCus, String roomId, String dayIn, String dayOut) throws ParseException {
        this.room = room;
        this.id = String.format("KH%02d", idx);
        idx++;
        this.nameCus = nameCus;
        this.roomId = roomId;
        this.days = calDays(dayIn, dayOut);
        long dur = this.days == 0 ? 1 : this.days;
        this.Total = dur * 1.0 * this.room.getPrice() * (1 + this.room.getFee()) * (100 - calDiscount()) / 100;
    }
    
    public int calDiscount(){
        if(days < 10)return 0;
        else if(days < 20)return 2;
        else if(days < 30)return 4;
        else return 6;
    }
    
    public long calDays(String dayIn, String dayOut) throws ParseException{
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        Date din = sf.parse(dayIn);
        Date dout = sf.parse(dayOut);
        long dur = dout.getTime() - din.getTime();
        long res = TimeUnit.MILLISECONDS.toDays(dur);
        return res;
    }
    
    public long getDays(){
        return this.days;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %d %.2f", id, nameCus, roomId, days, Total);
    }
}
