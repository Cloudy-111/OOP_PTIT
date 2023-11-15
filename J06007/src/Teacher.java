public class Teacher {
    private String idTeacher;
    private String nameTeacher;
    private double hours = 0;
    
    public Teacher(String id, String name){
        this.idTeacher = id;
        this.nameTeacher = name;
    }
    
    public void addHours(double hour){
        this.hours += hour;
    }
    
    public String getId(){
        return this.idTeacher;
    }
    
    public String getName(){
        return this.nameTeacher;
    }
    
    @Override
    public String toString(){
        return String.format("%s %.2f", nameTeacher, hours);
    }
}
