public class Teacher implements Comparable<Teacher>{
    public static int idx = 1;
    private String name, id, stat, Subject;
    private Double Total;

    public Teacher(String name, String idAdmis, Double p1, Double p2) {
        this.id = String.format("GV%02d", idx);
        idx += 1;
        this.name = name;
        this.Subject = subject(idAdmis);
        this.Total = p1 * 2 + p2 + bonus(idAdmis);
        this.stat = this.Total >= 18 ? "TRUNG TUYEN" : "LOAI";
    }
    public String subject(String id){
        char x = id.charAt(0);
        if(x == 'A')return "TOAN";
        else if(x == 'B')return "LY";
        else return "HOA";
    }
    public double bonus(String id){
        char x = id.charAt(1);
        if(x == '1')return 2.0;
        else if(x == '2')return 1.5;
        else if(x == '3')return 1.0;
        else return 0.0;
    }
    
    @Override
    public int compareTo(Teacher b){
        return b.Total.compareTo(this.Total);
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %.1f %s", id, name, Subject, Total, stat);
    }
}
