public class Product {
    private String idProd, name;
    private int price, guarantee;
    
    public Product(String idProd, String name, int price, int guarantee){
        this.idProd = idProd;
        this.name = name;
        this.price = price;
        this.guarantee = guarantee;
    }

    public String getIdProd() {
        return idProd;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getGuarantee() {
        return guarantee;
    }
    
    
}
