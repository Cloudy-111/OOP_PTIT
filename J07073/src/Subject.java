public class Subject implements Comparable<Subject>{
    private int num;
    private String id, name, theory, exercise;
    public Subject(String id, String name, int num, String theory, String exercise){
        this.id = id;
        this.name = name;
        this.num = num;
        this.theory = theory;
        this.exercise = exercise;
    }
    public String getExercise(){
        return this.exercise;
    }
    @Override
    public int compareTo(Subject b){
        return id.compareTo(b.id);
    }
    @Override
    public String toString(){
        return id + " " + name + " " + Integer.toString(num) + " " + theory + " " + exercise;
    }
}
