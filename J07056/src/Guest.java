public class Guest implements  Comparable<Guest>{
    private int id;
    private String name, type;
    private int start, end, underQuota, overQuota, VAT, cost ;
    public Guest(String name, String type, int start, int end){
        this.name = standard(name);
        this.type = type;
        this.start = start;
        this.end = end;
        this.cost = Cost(start, end, type);
    }
    public String standard(String s){
        String[] n = s.split(" ");
        StringBuilder res = new StringBuilder("");
        for(int i = 0; i < n.length; ++i){
            if(!n[i].isEmpty()){
                res.append(n[i].substring(0,1).toUpperCase()).append(n[i].substring(1).toLowerCase());
                if(i != n.length - 1)res.append(" ");
            }
        }
        return res.toString();
    }
    public int Cost(int start, int end, String type){
        int amount = end - start;
        int quota;
        if(type.equals("A"))quota = 100;
        else if(type.equals("B"))quota = 500;
        else quota = 200;
        this.overQuota = 0;
        if(amount <= quota)this.underQuota = amount * 450;
        else {
            this.underQuota += quota * 450;
            this.overQuota = (amount - quota) * 1000;
        }
        this.VAT = this.overQuota * 5 / 100;
        return this.underQuota + this.overQuota + this.VAT;
    }
    public int getCost(){
        return this.cost;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public int compareTo(Guest b){
        return b.getCost() - this.cost;
    }
    @Override
    public String toString(){
        return String.format("KH%02d %s %d %d %d %d", id, name, underQuota, overQuota, VAT, cost);
    }
}
