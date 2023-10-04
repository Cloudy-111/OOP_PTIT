public class CLB {
    private String name, id;
    private int numOfFan;
    public CLB(String id, String name, int numOfFan){
        this.name = name;
        this.id = id;
        this.numOfFan = numOfFan;
    }
    public String getId(){
        return this.id;
    }
    public int getNum(){
        return this.numOfFan;
    }
    public String getName(){
        return this.name;
    }
}
