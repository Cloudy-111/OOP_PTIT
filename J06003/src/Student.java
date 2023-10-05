public class Student {
    private String id, name, phone;
    private int ord;
    public Student(String id, String name, String phone, int ord){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.ord = ord;
    }
    public int getOrd(){
        return this.ord;
    }
    @Override
    public String toString(){
        return id + " " + name + " " + phone;
    }
}
