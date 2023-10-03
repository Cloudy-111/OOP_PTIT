public class Student implements Comparable<Student>{
    private int id, ord;
    private Double point;
    private String name, rank;
    public Student(String name, double point){
        this.name = name;
        this.point = point;
        this.rank = calRank(point);
    }
    public String calRank(double point){
        if(point < 5)return "Yeu";
        else if(point < 7)return "Trung Binh";
        else if(point < 9)return "Kha";
        else return "Gioi";
    }
    public void setId(int id){
        this.id = id;
    }
    public void setOrd(int ord){
        this.ord = ord;
    }
    public double getPoint(){
        return this.point;
    }
    @Override
    public int compareTo(Student b){
        return b.point.compareTo(this.point);
    }
    @Override
    public String toString(){
        return String.format("HS%02d %s %.1f %s %d", id, name, point, rank, ord);
    }
}
