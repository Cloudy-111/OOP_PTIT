public class Student implements Comparable<Student>{
    private String id, name, grade, email;
    public Student(String id, String name, String grade, String email){
        this.id = id;
        this.name = standard(name);
        this.grade = grade;
        this.email = email;
    }
    public String standard(String name){
        String[] tmp = name.split(" ");
        String res = "";
        for(int i = 0; i < tmp.length; i++){
            if(!tmp[i].isEmpty()){
                res += tmp[i].substring(0,1).toUpperCase() + tmp[i].substring(1).toLowerCase();
                if(i != tmp.length - 1)res += ' ';
            }
        }
        return res;
    }
    
    public String getId(){
        return this.id;
    }
    
    @Override
    public int compareTo(Student b){
        return this.id.compareTo(b.id);
    }
    
    @Override
    public String toString(){
        return this.id + " " + this.name + " " + this.grade;
    }
}
