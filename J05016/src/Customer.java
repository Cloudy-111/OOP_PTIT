
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Customer implements Comparable<Customer>{
    public static int idx = 1;
    private String id, name, room, dateIn, dateOut;
    private int bonus, days, Total;

    public Customer(String name, String room, String dateIn, String dateOut, int bonus) throws ParseException {
        this.id = String.format("KH%02d", idx);
        idx += 1;
        this.name = name;
        this.room = room;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.bonus = bonus;
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        long time = sf.parse(dateOut).getTime()- sf.parse(dateIn).getTime();
        this.days = (int)(time / (24 * 60 * 60 * 1000)) + 1;
        this.Total = this.days * price(room) + bonus;
    }
    public int price(String room){
        char x = room.charAt(0);
        if(x == '1')return 25;
        else if(x == '2')return 34;
        else if(x == '3')return 50;
        else return 80;
    }
    
    @Override
    public int compareTo(Customer b){
        return b.Total - this.Total;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %d %d", id, name, room, days, Total);
    }
}
