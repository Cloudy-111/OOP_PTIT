public class Product implements Comparable<Product>{
    private String id, name;
    private long amount, price, discount, Total;

    public Product(String id, String name, long amount, long price, long discount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.price = price;
        this.discount = discount;
        this.Total = price * amount - discount;
    }
    
    @Override
    public int compareTo(Product b){
        return (int)(b.Total / 1000 - this.Total / 1000);
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %d %d %d %d", id, name, amount, price, discount, Total);
    }
}
