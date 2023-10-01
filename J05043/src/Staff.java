public final class Staff {
    private String name;
    private int id;
    private long bonusPosition, mainWage, temp, remain;
    public Staff(String name, String position, long base_wage, long workDays){
        this.name = name;
        this.bonusPosition = calBonus(position);
        this.mainWage = base_wage * workDays;
        this.temp = calTemp(this.bonusPosition, this.mainWage);
        this.remain = this.mainWage - this.temp + this.bonusPosition;
    }
    public long calBonus(String position){
        if(position.equals("GD"))return 500l;
        else if(position.equals("PGD"))return 400l;
        else if(position.equals("TP"))return 300l;
        else if(position.equals("KT"))return 250l;
        else return 100l;
    }
    public long calTemp(long bonusPosition, long mainWage){
        long tmp = (long) Math.round((bonusPosition + mainWage) * 2.0 / 3);
        if(tmp < 25000l)return (long)(Math.round(((bonusPosition + mainWage) * 2.0 / 3) / 1000) * 1000);
        else return 25000L;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public String toString(){
        return String.format("NV%02d %s %d %d %d %d", id, name, bonusPosition, mainWage, temp, remain);
    }
}
