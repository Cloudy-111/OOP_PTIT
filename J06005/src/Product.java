public class Product {
    private String idProduct;
    private String nameProduct, unit;
    private long buy, sell;
    static int idx = 1;
    
    public Product(String name, String unit, long buy, long sell){
        this.idProduct = String.format("MH%03d", idx);
        idx++;
        this.nameProduct = name;
        this.unit = unit;
        this.buy = buy;
        this.sell = sell;
    }
    
    public String getIdProduct(){
        return this.idProduct;
    }
    
    public long getSell(){
        return this.sell;
    }
    
    public String getName(){
        return this.nameProduct;
    }
    
    public String getUnit(){
        return this.unit;
    }
    
    public long getBuy(){
        return this.buy;
    }
}
