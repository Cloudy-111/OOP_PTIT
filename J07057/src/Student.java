public class Student implements Comparable<Student>{
    private int id, area;
    private double score, last_score;
    private String name, ethnic, stat;
    public Student(String name, double score, String ethnic, int area){
        this.name = standard(name);
        this.score = score;
        this.ethnic = ethnic;
        this.area = area;
        this.last_score = last(area, score, ethnic);
        this.stat = this.last_score >= 20.5 ? "Do" : "Truot";
    }
    public String standard(String s){
        String[] n = s.split(" ");
        StringBuilder res = new StringBuilder("");
        for(int i = 0; i < n.length; ++i){
            if(!n[i].isEmpty()){
                res.append(n[i].substring(0,1).toUpperCase()).append(n[i].substring(1).toLowerCase());
                if(i != n.length - 1)res.append(" ");
            }
        }
        return res.toString();
    }
    public double last(int area, double score, String ethnic){
        double res = score;
        if(area == 1)res += 1.5;
        else if(area == 2)res += 1;
        if(!ethnic.equals("Kinh"))res += 1.5;
        return res;
    }
    public double getLastScore(){
        return this.last_score;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public int compareTo(Student b){
        if(b.getLastScore() > this.last_score)return 1;
        else if(b.getLastScore() < this.last_score)return -1;
        else return this.id - b.getId();
    }
    @Override
    public String toString(){
        return String.format("TS%02d %s %.1f %s", id, name, last_score, stat);
    }
}
