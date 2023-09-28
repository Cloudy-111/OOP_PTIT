public class Student{
    private String id, name, grade, email;
    public Student(String id, String name, String grade, String email){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.email = email;
    }
    public String getGrade(){
        return this.grade;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + grade + " " + email;
    }
}

