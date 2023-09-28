public class Student implements Comparable<Student>{
    private String id, name, grade, email;
    public Student(String id, String name, String grade, String email){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.email = email;
    }
    @Override
    public int compareTo(Student b){
        if(b.grade.equals(this.grade))return this.id.compareTo(b.id);
        return this.grade.compareTo(b.grade);
    }
    @Override
    public String toString(){
        return id + " " + name + " " + grade + " " + email;
    }
}

