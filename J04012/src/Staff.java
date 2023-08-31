public class Staff {
    private int id, workday;
    private String name, position;
    private long wage_base, wage_total, allowance, bonus;
    public Staff(String  name, long wage_base, int workday, String position){
        this.name = name;
        this.wage_base = wage_base;
        this.workday = workday;
        this.position = position;
        if(position.equals("GD"))this.allowance = 250000;
        else if(position.equals("PGD"))this.allowance = 200000;
        else if(position.equals("TP"))this.allowance = 180000;
        else this.allowance = 150000;
        long wage = wage_base * workday;
        if(workday >= 25)this.bonus = wage / 5;
        else if(workday >= 22)this.bonus = wage / 10;
        else this.bonus = 0;
        this.wage_total = wage + this.bonus + this.allowance;
    }
    @Override
    public String toString(){
        return String.format("NV01 %s %d %d %d %d", name, wage_base * workday, bonus, allowance, wage_total);
    }
}
