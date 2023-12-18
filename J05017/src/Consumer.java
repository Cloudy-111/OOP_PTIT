public class Consumer implements Comparable<Consumer>{
    public static int idx = 1;
    private String id, name;
    private int Total;
    
    public Consumer(String name, int prev, int pres){
        this.id = String.format("KH%02d", idx);
        idx += 1;
        int amount = pres - prev;
        this.name = name;
        this.Total = calTotal(amount);
    }
    public int calTotal(int amount){
        if(amount <= 50)return (int)(Math.round(amount * 100 * 102 * 1.0 / 100));
        else if(amount <= 100)return (int)(Math.round((50 * 100 + (amount - 50) * 150) * 103 * 1.0 / 100));
        else return ((int)(Math.round(50 * 100 + 50 * 150 + (amount - 100) * 200) * 105 * 1.0 / 100));
    }
    
    @Override
    public int compareTo(Consumer b){
        return b.Total - this.Total;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %d", id, name, Total);
    }
}
