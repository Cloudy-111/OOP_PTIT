public class BangDiem{
    private String idStud, idSub;
    private String result;
    
    public BangDiem(String id1, String id2, String res){
        this.idStud = id1;
        this.idSub = id2;
        this.result = res;
    }
    
    public String getIdSub(){
        return this.idSub;
    }
    
    public String getIdStud(){
        return this.idStud;
    }
    
    public String getRes(){
        return this.result;
    }
    
//    @Override
//    public int compareTo(BangDiem b){
//        if(b.result.equals(this.result))return this.idStud.compareTo(b.idStud);
//        else return b.result.compareTo(this.result);
//    }
    
    @Override
    public String toString(){
        return idStud + " " + idSub + " " + result;
    }
}
