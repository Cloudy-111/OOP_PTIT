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
        return this.id.compareTo(b.id);
    }
    @Override
    public String toString(){
        return id + " " + name + " " + grade + " " + email;
    }
}

