public class Schedule extends Subject implements Comparable<Schedule>{
    static int i = 1;
    private String id;
    private int date, kip;
    private String nameTeacher, room;
    
    public Schedule(String subjectId, String subjectName, int credits, int date, int kip, String nameTeacher, String room) {
        super(subjectId, subjectName, credits);
        this.id = String.format("HP%03d", i);
        i ++;
        this.date = date;
        this.nameTeacher = nameTeacher;
        this.room = room;
        this.kip = kip;
    }
    
    public String getIDSub(){
        return this.subjectId;
    }
    
    @Override
    public String toString(){
        return id + " " + date +  " " + kip + " " + nameTeacher + " " + room;
    }
    
    @Override
    public int compareTo(Schedule b){
        if(b.date == this.date){
            if(b.kip == this.kip){
                return this.nameTeacher.compareTo(b.nameTeacher);
            }
            else return this.kip - b.kip;
        }
        else return this.date - b.date;
    }
}
