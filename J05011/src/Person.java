public final class Person implements Comparable<Person>{
    private String id, name, enter, outer;
    private int time;
    public Person(String id, String  name, String enter, String outer){
        this.id = id;
        this.name = name;
        this.enter = enter;
        this.outer = outer;
        this.time = calTime(outer, enter);
    }
    public int getTime(){
        return this.time;
    }
    public int calTime(String outer, String enter){
        int en = Integer.parseInt(enter.substring(0,2)) * 60 + Integer.parseInt(enter.substring(3,5));
        int out = Integer.parseInt(outer.substring(0,2)) * 60 + Integer.parseInt(outer.substring(3,5));
        return out - en;
    }
    @Override
    public int compareTo(Person b){
        return b.getTime() - time;
    }
    @Override
    public String toString(){
        int hr = time / 60;
        int min = time % 60;
        return String.format("%s %s %d gio %d phut", id, name, hr, min);
    }
}
