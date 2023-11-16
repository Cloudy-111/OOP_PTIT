public class Product {
    protected String typeId, name;
    private long price1, price2;
    
    public Product(String typeId, String name, long price1, long price2){
        this.typeId = typeId;
        this.name = name;
        this.price1 = price1;
        this.price2 = price2;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getTypeId(){
        return this.typeId;
    }
    
    public long getPrice1(){
        return this.price1;
    }
    
    public long getPrice2(){
        return this.price2;
    }
}
