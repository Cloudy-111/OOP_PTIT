public class Student implements Comparable<Student>{
    private String id, name, phone, email;
    private String last;
    public Student(String id, String name, String phone, String email){
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        String[] n = name.split(" ");
        this.last = n[n.length - 1];
    }
    @Override
    public int compareTo(Student b){
        if(!b.last.equals(last))
            return last.compareTo(b.last);
        if(!b.name.equals(name))
            return name.compareTo(b.name);
        return id.compareTo(b.id);
    }
    @Override
    public String toString(){
        return id + " " + name + " " + phone + " " + email;
    }
}
