public class Bill extends Product{
    private char type;
    private int amount;
    private long discount, Total, cost;
    private String id;
    static int idx = 1;
    public Bill(String typeId, String name, long price1, long price2, char type, int amount) {
        super(typeId, name, price1, price2);
        this.id = String.format("-%03d", idx);
        idx++;
        this.type = type;
        this.amount = amount;
        if(this.type == '1')
            this.Total = this.amount * price1;
        else this.Total = this.amount * price2;
        if(this.amount >= 150)this.discount = this.Total * 50 / 100;
        else if(this.amount >= 100)this.discount = this.Total * 30 / 100;
        else if(this.amount >= 50)this.discount = this.Total * 15 / 100;
        else this.discount = 0;
        this.cost = this.Total - this.discount;
    }
    
    @Override
    public String toString(){
        return typeId + type + id + " " + name + " " + discount + " " + cost;
    }
    
}
