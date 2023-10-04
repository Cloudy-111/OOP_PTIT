
import java.time.zone.ZoneOffsetTransitionRule;

public class Product {
    private String id;
    private String firm;
    private long price, tax, Total;
    public Product(String id, int amount){
        this.id = id;
        this.firm = findFirm(id);
        this.price = calPrice(id);
        this.tax = calTax(id, this.price, amount);
        this.Total = this.price * amount + this.tax;
    }
    public String findFirm(String id){
        String tmp = id.substring(3);
        if(tmp.equals("BP"))return "British Petro";
        else if(tmp.equals("ES"))return "Esso";
        else if(tmp.equals("SH"))return "Shell";
        else if(tmp.equals("CA"))return "Castrol";
        else if(tmp.equals("MO"))return "Mobil";
        else return "Trong Nuoc";
    }
    public long calPrice(String id){
        char tmp = id.charAt(0);
        if(tmp == 'N')return 9700;
        else if(tmp == 'D')return 11200;
        else return 128000;
    }
    public long calTax(String id, long price, int amount){
        char tmp = id.charAt(0);
        String firm = id.substring(3);
        if(firm.equals("TN"))return 0L;
        else{
            if(tmp == 'N')return price * amount * 2 / 100;
            else if(tmp == 'D')return price * amount * 7 / 200;
            else return price * amount * 3 / 100;
        }
    }
    @Override
    public String toString(){
        return String.format("%s %s %d %d %d", id, firm, price, tax, Total);
    }
}
