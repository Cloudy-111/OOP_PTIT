public class Student implements Comparable<Student>{
    private int id;
    private String name, rank;
    private double p1, p2, p3, sum;
    public Student(String name, double p1, double p2, double p3){
        this.name = standard(name);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.sum = p1 * 0.25 + p2 * 0.35 + p3 * 0.4;
        this.rank = setRank(this.sum);
    }
    public String standard(String s){
        String[] n = s.split(" ");
        StringBuilder res = new StringBuilder("");
        for(int i = 0; i < n.length; ++i)
            if(!n[i].isEmpty()){
                res.append(n[i].substring(0,1).toUpperCase()).append(n[i].substring(1).toLowerCase());
                if(i != n.length - 1)res.append(" ");
            }
        return res.toString();
    }
    public String setRank(double s){
        if(s < 5)return "KEM";
        else if(s < 6.5)return "TRUNG BINH";
        else if(s < 8)return "KHA";
        else return "GIOI";
    }
    public double getSum(){
        return this.sum;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public int compareTo(Student b){
        if(b.getSum() > this.sum)return 1;
        else if(b.getSum() < this.sum)return -1;
        return 0;
    }
    @Override
    public String toString(){
        return String.format("SV%02d %s %.2f %s", id, name, sum, rank);
    }
}
