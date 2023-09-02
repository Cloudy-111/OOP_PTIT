public class Student {
    private int id;
    private String name, birthday, grade;
    private double GPA;
    
    public Student(){
        this.name = "";
        this.birthday = "";
        this.grade = "";
        this.id = 0;
        this.GPA = 0;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        name = name.toLowerCase();
        String[] tmp = name.split(" ");
        String res = "";
        for(int i = 0; i < tmp.length; ++i){
            if(!tmp[i].isEmpty())res += tmp[i].substring(0,1).toUpperCase() + tmp[i].substring(1) + " ";
        }
        this.name = res;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    public void setBirthday(String birthday){
        String[] tmp = birthday.split("/");
        String res = "";
        for(int i = 0; i < tmp.length; ++i){
            if(tmp[i].length() == 1 )res += "0" + tmp[i];
            else res += tmp[i];
            if(i != tmp.length - 1)res += "/";
        }
        this.birthday = res;
    }
    
    @Override
    public String toString(){
        return String.format("B20DCCN%03d %s %s %s %.2f", id, name, grade, birthday, GPA);
    }
}