public class Student {
    private String name, birthDay;
    private double p1, p2, p3, sum;
    
    public Student(String name, String birthDay, double p1, double p2, double p3, double sum){
        this.name = name;
        this.birthDay = birthDay;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.sum = p1 + p2 + p3;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %.1f", name, birthDay, sum);
    }
}
