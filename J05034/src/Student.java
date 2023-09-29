public class Student implements Comparable<Student>{
    private String id, name, grade, email, company;
    private int ord;
    public Student(String id, String name, String grade, String email, String company){
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.email = email;
        this.company = company;
    }
    public void setOrd(int ord){
        this.ord = ord;
    }
    public String getCom(){
        return this.company;
    }
    @Override
    public int compareTo(Student b){
        return this.name.compareTo(b.name);
    }
    @Override
    public String toString(){
        return String.format("%d %s %s %s %s %s", ord, id, name, grade, email, company);
        //return ord + " " + id + " " + name + " " + grade + " " + email + " " + company;
    }
}
