public class Staff {
    private Dept dept;
    private String id, name, deptName;
    public long Total;  
    public Staff(Dept dept, String id, String name, long baseWage, int workDays){
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.Total = baseWage * workDays * calBase(id);
    }
    public int calBase(String id){
        char type = id.charAt(0);
        int year = Integer.parseInt(id.substring(1,3));
        switch (type) {
            case 'A':
                if(year <= 3)return 10;
                else if(year <= 8)return 12;
                else if(year <= 15)return 14;
                else return 20;
            case 'B':
                if(year <= 3)return 10;
                else if(year <= 8)return 11;
                else if(year <= 15)return 13;
                else return 16;
            case 'C':
                if(year <= 3)return 9;
                else if(year <= 8)return 10;
                else if(year <= 15)return 12;
                else return 14;
            default:
                if(year <= 3)return 8;
                else if(year <= 8)return 9;
                else if(year <= 15)return 11;
                else return 13;
        }
    }
    @Override
    public String toString(){
        return id + " " + name + " " + dept + " " + Total + "000";
    }
}
