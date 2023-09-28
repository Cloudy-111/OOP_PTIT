public class Student{
    private String id, name, grade, email;
    public Student(String id, String name, String grade, String email){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.email = email;
    }
    public String getMajor(){
        return this.id.substring(3,7);
    }
    public String getMode(){
        return this.grade.substring(0,1);
    }
    @Override
    public String toString(){
        return id + " " + name + " " + grade + " " + email;
    }
}

