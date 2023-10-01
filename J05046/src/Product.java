public class Product {
    private int ord, amount;
    private String name, id;
    private long price, dis, Total;
    public Product(String name, int amount, long price){
        this.name = name;
        this.id = comp(name);
        this.dis = calDis(price, amount);
        this.Total = price * amount - dis;
    }
    public String comp(String name){
        String[] a = name.split(" ");
        String res = "";
        for(int i = 0; i < 2; ++i)res += a[i].substring(0,1).toUpperCase();
        return res;
    }
    public long calDis(long price, int amount){
        long tmp = price * amount;
        if(amount > 10)return tmp * 5 /100;
        else if(amount >= 8)return tmp * 2 / 100;
        else if(amount >= 5)return tmp / 100;
        else return 0L;
    }
    public String getId(){
        return this.id;
    }
    public void setOrd(int ord){
        this.ord = ord;
    }
    @Override
    public String toString(){
        return String.format("%s%02d %s %d %d", id, ord, name, dis, Total);
    }
}
