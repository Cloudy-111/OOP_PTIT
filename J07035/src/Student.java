public class Student {
    private String idStud, nameStud, email, grade;
    
    public Student(String id, String name, String grade, String email){
        this.idStud = id;
        this.nameStud = standard(name);
        this.grade = grade;
        this.email = email;
    }
    
    public String standard(String s){
        String[] tmp = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < tmp.length; i++)if(!tmp[i].isEmpty()){
            sb.append(tmp[i].substring(0,1).toUpperCase()).append(tmp[i].substring(1).toLowerCase());
            if(i != tmp.length - 1)sb.append(" ");
        }
        return sb.toString();
    }

    public String getIdStud() {
        return idStud;
    }

    public String getNameStud() {
        return nameStud;
    }

    public String getEmail() {
        return email;
    }

    public String getGrade() {
        return grade;
    }
}
