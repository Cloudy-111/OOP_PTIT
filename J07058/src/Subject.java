public class Subject implements Comparable<Subject>{
    private String id, name, form;
    public Subject(String id, String name, String form){
        this.id = id;
        this.name = name;
        this.form = form;
    }
    public String getId(){
        return this.id;
    }
    @Override
    public int compareTo(Subject b){
        return this.id.compareTo(b.getId());
    }
    @Override
    public String toString(){
        return id + " " + name + " " + form;
    }
}
