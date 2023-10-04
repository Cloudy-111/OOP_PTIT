public class Match implements Comparable<Match>{
    private String id, name;
    private int numOfFan;
    private long Price;
    private long Res;
    public Match(String id, long Price){
        this.id = id;
        this.Price = Price;
        this.Res = Price * this.numOfFan;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRes(int num){
        this.Res = this.Price * num;
    }
    public String getIdClb(){
        return id.substring(1,3);
    }
    @Override
    public int compareTo(Match b){
        if(b.Res == this.Res)return this.name.compareTo(b.name);
        else return (int) (b.Res / 1000 - this.Res / 1000);
    }
    @Override
    public String toString(){
        return String.format("%s %s %d", id, name, Res);
    }
}
