public class Student {
    private int id;
    private String name, birth, grade;
    private double GPA;
    public Student(String name, String grade, String birth, double GPA){
        this.name = name;
        this.grade = grade;
        this.birth = standart(birth);
        this.GPA = GPA;
    }
    public String standart(String s){
        String[] a = s.split("/");
        String res = "";
        for(int i = 0; i < a.length; ++i){
            if(a[i].length() == 1)res+="0"+a[i];
            else res+=a[i];
            if(i != a.length - 1)res+="/";
        }
        return res;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public String toString(){
        return String.format("B20DCCN%03d %s %s %s %.2f", id, name, grade, birth, GPA);
    }
}
