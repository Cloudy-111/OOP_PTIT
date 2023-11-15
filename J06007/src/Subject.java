public class Subject {
    private String idSubject;
    private String nameSubject;
    
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
}
