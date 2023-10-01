public class Student implements Comparable<Student>{
    private String name;
    private int correct, submit;
    private double point;
    public Student(String name, int correct, int submit){
        this.name = name;
        this.correct = correct;
        this.submit = submit;
    }
    @Override
    public int compareTo(Student b){
        if(this.correct == b.correct){
            if(this.submit == b.submit)return this.name.compareTo(b.name);
            else return this.submit - b.submit;
        }
        else return b.correct - this.correct;
    }
    @Override
    public String toString(){
        return String.format("%s %d %d", name, correct, submit);
    }
}
