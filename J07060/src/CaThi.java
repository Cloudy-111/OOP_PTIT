public class CaThi{
    static int idx = 1;
    private String date, hour, room;
    private String id;
    
    public CaThi(String date, String hour, String room){
        this.id = String.format("C%03d", idx);
        idx++;
        this.date = date;
        this.hour = hour;
        this.room = room;
    }

    public String getId() {
        return id;
    }

    public String getDate() {
        return date;
    }

    public String getHour() {
        return hour;
    }

    public String getRoom() {
        return room;
    }
    

    @Override
    public String toString() {
        return date + " " + hour + " " + room;
    }
    
}
