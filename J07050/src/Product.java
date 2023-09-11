public class Product implements Comparable<Product>{
    private int id;
    private String name, group;
    private double buy, sell, profit;
    public Product(String name, String group, double buy, double sell){
        this.name = name;
        this.group = group;
        this.buy = buy;
        this.sell = sell;
        this.profit = sell - buy;
    }
    public double getProfit(){
        return this.profit;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public int compareTo(Product b){
        return (int)(b.getProfit() - this.profit);
    }
    @Override
    public String toString(){
        return String.format("MH%02d %s %s %.2f", id, name, group, profit);
    }
}
