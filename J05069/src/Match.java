public class Match {
    private String id, name;
    private int numOfFan;
    private long Price;
    public Match(String id, long Price){
        this.id = id;
        this.Price = Price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setNumOfFan(int num){
        this.numOfFan = num;
    }
    public String getIdClb(){
        return id.substring(1,3);
    }
    @Override
    public String toString(){
        return String.format("%s %s %d", id, name, Price * numOfFan);
    }
}
