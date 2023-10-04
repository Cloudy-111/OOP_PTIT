public class Dept {
    private String id, name;
    public Dept(String id, String name){
        this.id = id;
        this.name = name;
    }
    public String getId(){
        return this.id;
    }
    @Override
    public String toString(){
        return name;
    }
}
