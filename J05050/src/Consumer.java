public class Consumer {
    private int id, base;
    private long Price, bonus, Total;
    public Consumer(String type, int oldIdx, int newIdx){
        this.base = calBase(type);
        this.Price = (newIdx - oldIdx) * this.base * 550l;
        this.bonus = calBonus(oldIdx, newIdx, Price);
        this.Total = this.Price + this.bonus;
    }
    public int calBase(String type){
        if(type.equals("KD"))return 3;
        else if(type.equals("NN"))return 5;
        else if(type.equals("TT"))return 4;
        else return 2;
    }
    public long calBonus(int oldIdx, int newIdx, long Price){
        int dis = newIdx - oldIdx;
        if(dis < 50)return 0l;
        else if(dis <= 100)return (long) Math.round(Price * 35.0 / 100);
        else return Price;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public String toString(){
        return String.format("KH%02d %d %d %d %d", id, base, Price, bonus, Total);
    }
    
}
