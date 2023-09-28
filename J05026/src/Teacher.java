
public class Teacher{
    private int id;
    private String name, Major;
    public Teacher(String name, String Major){
        this.name = name;
        this.Major = compMajor(Major);
    }
    public void setId(int id){
        this.id = id;
    }
    public String compMajor(String s){
        String res = "";
        String[] a = s.split(" ");
        for(String i : a)res += i.substring(0, 1).toUpperCase();
        return res;
    }
    public String getMajor(){
        return this.Major;
    }
    @Override
    public String toString(){
        return String.format("GV%02d %s %s", id, name, Major);
    }
}
