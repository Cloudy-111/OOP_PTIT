public class Subject {
    private String idSub, nameSub;
    private int credits;
    
    public Subject(String id, String name, int credits){
        this.idSub = id;
        this.nameSub = name;
        this.credits = credits;
    }
    
    public String getId(){
        return this.idSub;
    }
    
    public String getName(){
        return this.nameSub;
    }
    
    public int getCre(){
        return this.credits;
    }
}
