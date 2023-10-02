public class Order {
    private String name, id, ord;
    private char type;
    private long discount, Total;
    public Order(String name, String id, int Price, int amount){
        this.name = name;
        this.id = id;
        this.ord = id.substring(1,4);
        this.type = id.charAt(id.length() - 1);
        this.discount = calDiscount(Price, amount, type);
        this.Total = Price * amount - this.discount;
    }
    public long calDiscount(long Price, int amount, char type){
        if(type == '1')return Price * amount * 50 / 100;
        else return Price * amount * 30 / 100;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %d %d", name, id, ord, discount, Total);
    }
}
