public class Teacher {
    private String id, name;
    private long wage_base, wage_total, allowance;
    private int base;
    public Teacher(String id, String name, long wage_base){
        this.id = id;
        this.name = name;
        this.wage_base = wage_base;
    }
    public void setAllowance(String id){
        String s = id.substring(0,2);
        if(s.equals("HT") == true)this.allowance = 2000000;
        else if(s.equals("HP") == true)this.allowance = 900000;
        else if(s.equals("GV") == true)this.allowance = 500000;
    }
    public void setBase(String id){
        String s = id.substring(2,4);
        this.base = Integer.parseInt(s);
    }
    public void setWageTotal(){
        this.wage_total = this.wage_base * this.base + this.allowance;
    }
    public String getId(){
        return this.id;
    }
    @Override
    public String toString(){
        return String.format("%s %s %d %d %d", id, name, base, allowance, wage_total);
    }
}
