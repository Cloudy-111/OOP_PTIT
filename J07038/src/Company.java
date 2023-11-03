public class Company {
    private String id, name;
    private int numsOfStudent;
    public Company(String id, String name, int numsOfStudent){
        this.id = id;
        this.name = name;
        this.numsOfStudent = numsOfStudent;
    }
    public String getId(){
        return this.id;
    }
    public int getNums(){
        return this.numsOfStudent;
    }
    public String getName(){
        return this.name;
    }
}
