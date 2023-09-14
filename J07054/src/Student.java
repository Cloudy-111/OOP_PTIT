public class Student implements Comparable<Student>{
    private int id, rank;
    private String name;
    private int p1, p2, p3;
    private double ave;
    public Student(String name, int p1, int p2, int p3){
        this.name = standard(name);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.ave = (p1 * 3f + p2 * 3f + p3 * 2f) / 8;
    }
    public String standard(String s){
        String[] n = s.split(" ");
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < n.length; ++i){
            if(!n[i].isEmpty()){
                sb.append(n[i].substring(0,1).toUpperCase()).append(n[i].substring(1,n[i].length()).toLowerCase());
                if(i != n.length - 1)sb.append(" ");
            }
        }
        return sb.toString();
    }
    public double getAve(){
        return this.ave;
    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setRank(int rank){
        this.rank = rank;
    }
    public int getRank(){
        return this.rank;
    }
    @Override
    public int compareTo(Student b){
        if(b.getAve() > this.ave)return 1;
        else if(b.getAve() < this.ave)return -1;
        else return this.id - b.getId();
    }
    @Override
    public String toString(){
        return String.format("SV%02d %s %.2f %d", id, name, ave, rank);
    }
}
