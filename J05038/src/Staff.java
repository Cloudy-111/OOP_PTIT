public class Staff {
    private int id;
    private long day_wage, workDays, monthWage, bonus, allowPos, Total;
    private String name, position;
    public Staff(String name, long day_wage, long workDays, String position){
        this.name = name;
        this.monthWage = day_wage * workDays;
        this.bonus = calBonus(workDays, this.monthWage);
        this.allowPos = calAllowance(position);
        this.Total = this.monthWage + this.bonus + this.allowPos;
        
    }
    public long calBonus(long workDays, long monthWage){
        if(workDays >= 25)return monthWage / 5;
        else if(workDays >= 22)return monthWage / 10;
        else return 0L;
    }
    public long calAllowance(String position){
        if(position.equals("GD"))return 250000;
        else if(position.equals("PGD"))return 200000;
        else if(position.equals("TP"))return 180000;
        else return 150000;
    }
    public void setId(int id){
        this.id = id;
    }
    public long getTotal(){
        return this.Total;
    }
    @Override
    public String toString(){
        return String.format("NV%02d %s %d %d %d %d",id, name, monthWage, bonus, allowPos, Total);
    }
}
