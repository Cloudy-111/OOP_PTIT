
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Customer implements Comparable<Customer>{
    static int idx = 1;
    private String nameCus, address, idProd, dateBuy, id, dateEnd;
    private int amount, Total;
    private Product prod;
    
    public Customer(Product prod, String name, String address, String idProd, int amount, String dateBuy) throws ParseException{
        this.id = String.format("KH%02d", idx);
        idx++;
        this.nameCus = name;
        this.address = address;
        this.idProd = idProd;
        this.amount = amount;
        this.prod = prod;
        this.dateBuy = dateBuy;
        this.dateEnd = calDateEnd(dateBuy, prod.getGuarantee());
        this.Total = amount * prod.getPrice();
    }
    
    public String calDateEnd(String dateBuy, int gua) throws ParseException{
        SimpleDateFormat sf = new SimpleDateFormat("dd/MM/yyyy");
        int date = sf.parse(dateBuy).getDate();
        int month = sf.parse(dateBuy).getMonth() + 1;
        int year = Integer.parseInt(dateBuy.substring(6));
        int newMonth = (month + gua) % 12;
        if(newMonth == 0)newMonth = 12;
        int newYear = year + (month + gua - 1) / 12;
        return String.format("%02d/%02d/%d", date, newMonth, newYear);
    }
    
    @Override
    public int compareTo(Customer b){
        int year = this.dateEnd.substring(6).compareTo(b.dateEnd.substring(6));
        if(year == 0){
            int month = this.dateEnd.substring(3,5).compareTo(b.dateEnd.substring(3,5));
            if(month == 0){
                return this.dateEnd.substring(0,2).compareTo(b.dateEnd.substring(0, 2));
            }
            else return month;
        }
        else return year;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %s %d %s", id, nameCus, address, prod.getIdProd(), Total, dateEnd);
    }
}
