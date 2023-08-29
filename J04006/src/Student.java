public class Student {
    private String id, name, grade, birthDay;
    private double p;
    
    public Student(){
        this.id = "";
        this.name = "";
        this.birthDay = "";
        this.grade = "";
        this.p = 0.0;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setBirthday(String birthDay){
        this.birthDay = birthDay;
    }
    public void setname(String name){
        this.name = name;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public String getBirthday(){
        return this.birthDay;
    }
    public void setP(double p){
        this.p = p;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %s %.2f", id, name, grade, birthDay, p);
    }
}
