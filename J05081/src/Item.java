public class Item implements Comparable<Item>{
    private int id, sell, buy, profit;
    private String name, unit;
    public Item(String name, String unit, int buy, int sell){
        this.name = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
        this.profit = sell - buy;
    }
    public int getProfit(){
        return sell - buy;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public int compareTo(Item a){
        if(profit == a.getProfit()){
            return id - a.getId();
        }
        return a.getProfit() - profit;
    }
    @Override
    public String toString(){
        return String.format("MH%03d %s %s %d %d %d", id, name, unit, buy, sell, profit);
    }
}
