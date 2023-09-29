public class Student implements Comparable<Student>{
    private String id, name, grade;
    private double p1, p2, p3;
    public Student(String id, String name, String grade, double p1, double p2, double p3){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }
    @Override
    public int compareTo(Student b){
        return this.id.compareTo(b.id);
    }
    @Override
    public String toString(){
        return id + " " + name + " " + grade + " " + String.format("%.1f %.1f %.1f", p1, p2, p3);
    }
}
