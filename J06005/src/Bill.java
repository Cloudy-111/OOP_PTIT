
import java.util.ArrayList;

public class Bill implements Comparable<Bill>{
    private String idBill;
    private Customer Cus;
    private Product Prod;
    private int amount;
    private long Total;
    private long profit;
    static int idx = 1;
    static ArrayList<Customer> lstCus = new ArrayList<>();
    static ArrayList<Product> lstProd = new ArrayList<>();
    
    public Bill(String idCus, String idProd, int amount){
        this.idBill = String.format("HD%03d", idx);
        idx++;
        for(Customer i : lstCus)if(i.getIdCus().equals(idCus))Cus = i;
        for(Product i : lstProd)if(i.getIdProduct().equals(idProd))Prod = i;
        this.amount = amount;
        this.Total = amount * Prod.getSell();
        this.profit = amount * (Prod.getSell() - Prod.getBuy());
    }
    
    public static void addCus(Customer a){
        lstCus.add(a);
    }
    
    public static void addProd(Product a){
        lstProd.add(a);
    }
    
    @Override
    public int compareTo(Bill b){
        return (int)(b.profit - this.profit);
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %s %d %d %d", idBill, Cus.getName(), Cus.getAddress(), Prod.getName(), amount, Total, profit);
    }
}
