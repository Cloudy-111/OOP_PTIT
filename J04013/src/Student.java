public class Student {
    private String id, name, stat;
    private double p1, p2, p3, sum, p_priority;
    public Student(String id, String name, double p1, double p2, double p3){
        this.id = id;
        this.name = name;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.sum = p1 * 2 + p2 + p3;
    }
    public double getSum(){
        return this.sum;
    }
    public double getPriority(){
        return this.p_priority;
    }
    public String getId(){
        return this.id;
    }
    public void setStat(double sum){
        if(sum >= 24)this.stat = "TRUNG TUYEN";
        else this.stat = "TRUOT";
    }
    public void setPriority(String id){
        String first = id.substring(0,3);
        if(first.equals("KV1"))this.p_priority = 0.5;
        else if(first.equals("KV2"))this.p_priority = 1;
        else this.p_priority = 1.5;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %s %s", id, name, (p_priority == (int)p_priority) ? String.valueOf((int)p_priority) : String.valueOf(p_priority), (sum == (int)sum) ? String.valueOf((int)sum) : String.valueOf(sum), stat);
    }
}
