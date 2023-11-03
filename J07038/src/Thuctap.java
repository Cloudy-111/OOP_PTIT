public class Thuctap {
    private String idStudent, idCompany;
    public Thuctap(String idStudent, String idCompany){
        this.idCompany = idCompany;
        this.idStudent = idStudent;
    }
    public String getIdCompany(){
        return this.idCompany;
    }
    public String getIdStudent(){
        return this.idStudent;
    }
}
