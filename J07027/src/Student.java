public class Student {
    private String idStudent, nameStudent, phone;
    public Student(String id, String name, String phone){
        this.idStudent = id;
        this.nameStudent = name;
        this.phone = phone;
    }
    
    public String getId(){
        return this.idStudent;
    }
    
    public String getName(){
        return this.nameStudent;
    }
    
    public String getPhone(){
        return this.phone;
    }
}
