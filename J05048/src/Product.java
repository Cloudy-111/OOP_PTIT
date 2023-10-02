public class Product {
    private String id;
    private int enter, outer;
    private long price, money, tax;
    public Product(String id, int enter){
        this.id = id;
        this.enter = enter;
        this.outer = calOuter(enter, id);
        this.price = calPrice(id);
        this.money = this.price * this.outer;
        this.tax = calTax(money, id);
    }
    public int calOuter(int enter, String id){
        if(id.charAt(0) == 'A')return (int) Math.round(enter * 60.0 / 100);
        else return (int) Math.round(enter * 70.0 / 100);
    }
    public long calPrice(String id){
        if(id.charAt(id.length() - 1) == 'Y')return 110000;
        else return 135000;
    }
    public long calTax(long money, String id){
        if(id.charAt(0) == 'A'){
            if(id.charAt(id.length() - 1) == 'Y')return money * 8 / 100;
            else return money * 11 / 100;
        }
        else{
            if(id.charAt(id.length() - 1) == 'Y')return money * 17 / 100;
            else return money * 22 / 100;
        }
    }
    @Override
    public String toString(){
        return String.format("%s %d %d %d %d %d", id, enter, outer, price, money, tax);
    }
}
