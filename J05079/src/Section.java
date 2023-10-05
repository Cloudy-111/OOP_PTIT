public class Section implements Comparable<Section>{
    private String id, name, ord, nameTeacher;
    public Section(String id, String name, String ord, String nameTeacher){
        this.id = id;
        this.name = name;
        this.ord = ord;
        this.nameTeacher = nameTeacher;
    }
    public String getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public int compareTo(Section b){
        return this.ord.compareTo(b.ord);
    }
    @Override
    public String toString(){
        return ord + " " + nameTeacher;
    }
}
