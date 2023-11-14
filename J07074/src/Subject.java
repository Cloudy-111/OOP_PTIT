public class Subject {
    protected String subjectId, subjectName;
    protected int credits;
    
    public Subject(String id, String name, int credits){
        this.subjectId = id;
        this.subjectName = name;
        this.credits = credits;
    }
    
    public String getSubjectId(){
        return this.subjectId;
    }
    
    public String getSubjectName(){
        return this.subjectName;
    }
    
    public int getCredits(){
        return this.credits;
    }
}
