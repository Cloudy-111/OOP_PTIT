public class Subject {
    protected String idSubject;
    protected String nameSubject;
    private double hours = 0;
    
    public Subject(String id, String name){
        this.idSubject = id;
        this.nameSubject = name;
    }
    
    public String getId(){
        return this.idSubject;
    }
    
    public String getName(){
        return this.nameSubject;
    }
    public void addHours(double hour){
        this.hours += hour;
    }
    
    @Override
    public String toString(){
        return nameSubject + " " + hours;
    }
}