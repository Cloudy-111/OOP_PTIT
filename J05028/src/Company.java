public class Company implements Comparable<Company>{
    private String id, name;
    private int num;
    public Company(String id, String name, int num){
        this.id = id;
        this.name = name;
        this.num = num;
    }
    @Override
    public int compareTo(Company b){
        if(b.num == this.num)return this.id.compareTo(b.id);
        return b.num - this.num;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + num;
    }
}
