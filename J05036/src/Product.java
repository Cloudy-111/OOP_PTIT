public class Product{
    private int id;
    private long feeShip, result, price, priceIn, amount;
    private String name, unit;
    public Product(String name, String unit, long priceIn, long amount){
        this.name = name;
        this.unit = unit;
        this.feeShip = (long) Math.ceil((priceIn * amount) * 5.0 / 100);
        this.result = (long) Math.ceil((priceIn * amount) * 1.0 + this.feeShip);
        this.price = (long) (Math.ceil((this.result * 1.0 + this.result * 2.0 / 100) * 1.0)) ;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public String toString(){
        return String.format("MH%02d %s %s %d %d %d", id, name, unit , feeShip, result, price);
    }
}
