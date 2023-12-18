public class Candidate implements Comparable<Candidate>{
    public static int idx = 1;
    private String name, id, stat;
    private Double p1, p2, ave;

    public Candidate(String name, double p1, double p2) {
        this.id = String.format("TS%02d", idx);
        idx ++;
        this.name = name;
        this.p1 = p1 > 10 ? p1 / 10 : p1;
        this.p2 = p2 > 10 ? p2 / 10 : p2;
        this.ave = (this.p1 + this.p2) / 2;
        this.stat = setStat(this.ave);
    }
    public String setStat(double point){
        if(point < 5)return "TRUOT";
        else if(point < 8)return "CAN NHAC";
        else if(point < 9.5)return "DAT";
        else return "XUAT SAC";
    }
    public double fix(double point){
        if(point > 10)return point / 10;
        return point;
    }
    
    @Override
    public int compareTo(Candidate b){
        return b.ave.compareTo(this.ave);
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %.2f %s", id, name, ave, stat);
    }
}
