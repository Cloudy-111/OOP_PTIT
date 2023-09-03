public class Item implements Comparable<Item>{
    private int id;
    private String name, group;
    private double buy, sell, profit;
    public Item(String name, String group, double buy, double sell){
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
    public int compareTo(Item b){
        return (int)(b.getProfit() - profit);
    }
    @Override
    public String toString(){
        return String.format("%d %s %s %.2f", id, name, group, profit);
    }
}
