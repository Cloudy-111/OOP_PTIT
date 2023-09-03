public class Student implements Comparable<Student>{
    private int id;
    private String name, birthday;
    private double p1, p2, p3, sum;
    public Student(String name, String birthday, double p1, double p2, double p3){
        this.name = name;
        this.birthday = birthday;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.sum = p1 + p2 + p3;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public double getSum(){
        return this.sum;
    }
    @Override
    public int compareTo(Student b){
        if(b.getSum() == sum){
            return id - b.getId();
        }
        else return (int)(b.getSum() - sum);
    }
    @Override
    public String toString(){
        return String.format("%d %s %s %.1f", id, name, birthday, sum);
    }
}
