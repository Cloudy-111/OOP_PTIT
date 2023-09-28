
public class Teacher implements Comparable<Teacher>{
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
    @Override
    public int compareTo(Teacher b){
        String[] name1 = this.name.split(" ");
        String[] name2 = b.name.split(" ");
        if(name1[name1.length - 1].equals(name2[name2.length - 1]))return this.id - b.id;
        else return name1[name1.length - 1].compareTo(name2[name2.length - 1]);
    }
    @Override
    public String toString(){
        return String.format("GV%02d %s %s", id, name, Major);
    }
}
