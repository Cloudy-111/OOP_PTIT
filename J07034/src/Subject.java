public class Subject implements Comparable<Subject>{
    private String id, name;
    private int number;
    public Subject(String id, String name, int number){
        this.id = id;
        this.name = name;
        this.number = number;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public int compareTo(Subject b){
        return this.name.compareTo(b.getName());
    }
    @Override
    public String toString(){
        return String.format("%s %s %d", id, name, number);
    }
}
