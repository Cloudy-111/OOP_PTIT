public class Student implements Comparable<Student>{
    private String id, name, grade, email;
    public Student(String id, String name, String grade, String email){
        this.id = id;
        this.name = standard(name);
        this.grade = grade;
        this.email = email;
    }
    public String getId(){
        return this.id;
    }
    public String standard(String s){
        String[] a = s.split(" ");
        StringBuilder res = new StringBuilder("");
        for(int i = 0; i < a.length; ++i)if(!a[i].isEmpty()){
            res.append(a[i].substring(0,1).toUpperCase()).append(a[i].substring(1, a[i].length()).toLowerCase());
            if(i != a.length - 1)res.append(" ");
        }
        return res.toString();
    }
    @Override
    public int compareTo(Student b){
        return this.id.compareTo(b.getId());
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %s", id, name, grade, email);
    }
}
