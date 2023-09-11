public class Product implements Comparable<Product>{
    private String id, name;
    private int sell, hansd;
    public Product(String id, String name, int sell, int hansd){
        this.id = id;
        this.name = name;
        this.sell = sell;
        this.hansd = hansd;
    }
    public int getSell(){
        return this.sell;
    }
    public String getId(){
        return this.id;
    }
    @Override
    public int compareTo(Product b){
        if(this.sell == b.getSell()){
            return (int)(this.id.compareTo(b.getId()));
        }
        else return b.getSell() - this.sell;
    }
    @Override
    public String toString(){
        return String.format("%s %s %d %d", id, name, sell, hansd);
    }
}
