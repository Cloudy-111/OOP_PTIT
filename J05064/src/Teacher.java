public class Teacher {
    private String id, name, position;
    private int base;
    private long bonus, Total;
    public Teacher(String id, String name, long baseWage){
        this.id = id;
        this.name = name;
        this.position = id.substring(0,2);
        this.base = Integer.parseInt(id.substring(2));
        this.bonus = calBonus(position);
        this.Total = baseWage * base + this.bonus;
    }
    public long calBonus(String position){
        if(position.equals("HT"))return 2000000;
        else if(position.equals("HP"))return 900000;
        else return 500000;
    }
    public String getPosition(){
        return this.position;
    }
    @Override
    public String toString(){
        return String.format("%s %s %d %d %d", id, name, base, bonus, Total);
    }
}
