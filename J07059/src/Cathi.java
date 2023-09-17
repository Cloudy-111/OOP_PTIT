public class Cathi implements Comparable<Cathi>{
    private int id;
    private String day, time, room;
    public Cathi(String day, String time, String room){
        this.day = day;
        this.time = time;
        this.room = room;
    }
    public String getDay(){
        return this.day;
    }
    public String getTime(){
        return this.time;
    }
    public String getRoom(){
        return this.room;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    @Override
    public int compareTo(Cathi b){
        if(b.getDay().equals(this.day)){
            if(b.getTime().equals(this.time))
                return this.id - b.getId();
            else return this.time.compareTo(b.getTime());
        }
        else return this.day.compareTo(b.getDay());
    }
    @Override
    public String toString(){
        return "C" + String.format("%03d", id) + " " + day + " " + time + " " + room;
    }
}
