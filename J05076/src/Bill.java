public class Bill {
    private Product prd;
    private long TotalEnter, TotalOuter;
    public Bill(Product prd, long numEnter, long priceEnter, long numOuter){
        this.prd = prd;
        this.TotalEnter = numEnter * priceEnter;
        this.TotalOuter = numOuter * priceEnter * (this.prd.getTarget() + 100) / 100;
    }
    @Override
    public String toString(){
        return this.prd + " " + TotalEnter + " " + TotalOuter;
    }
}
