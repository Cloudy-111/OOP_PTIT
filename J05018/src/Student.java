public final class Student implements Comparable<Student>{
    private int id;
    private String name, rank;
    private double[] point;
    private double avePoint;
    public Student(String name, double[] point){
        this.name = name;
        this.point = point;
        this.avePoint = ave(point);
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public void setRank(double avepoint){
        if(avepoint >= 9.0)this.rank = "XUAT SAC";
        else if(avepoint >= 8.0)this.rank = "GIOI";
        else if(avepoint >= 7.0)this.rank = "KHA";
        else if(avepoint >= 5.0)this.rank = "TB";
        else this.rank = "YEU";
    }
    public double getAve(){
        return this.avePoint;
    }
    public double ave(double[] point){
        double res = 0;
        for(int i = 0; i < 10; ++i)res += point[i];
        res += point[0] + point[1];
        res /= 12;
        res = Math.round(res * 10f) / 10f;
        return res;
    }
    @Override
    public int compareTo(Student b){
        if(b.getAve() == avePoint){
            return id - b.getId();
        }
        else{
            if(b.getAve() > avePoint)return 1;
            else if(b.getAve() < avePoint)return -1;
            else return 0;
        }
    }
    @Override
    public String toString(){
        return String.format("HS%02d %s %.1f %s", id, name, avePoint, rank);
    }
}
