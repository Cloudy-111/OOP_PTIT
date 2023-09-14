public class Student{
    private int Id, age, sum;
    private String name, birth;
    private double p1, p2;
    private String rank;
    private double bonus;
    public Student(String name, String birth, double p1, double p2){
        this.name = standard(name);
        this.birth = modBirth(birth);
        this.age = 2021 - Integer.parseInt(this.birth.substring(6));
        this.p1 = p1;
        this.p2 = p2;
        this.bonus = calBonus(p1, p2);
        this.sum = calSum(p1, p2, this.bonus);
        this.rank = setRank(this.sum);
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
    public String modBirth(String s){
        String[] n = s.split("/");
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < n.length; ++i){
            if(n[i].length() == 1)sb.append("0").append(n[i]);
            else sb.append(n[i]);
            if(i != n.length - 1)sb.append("/");
        }
        return sb.toString();
    }
    public double calBonus(double p1, double p2){
        if(p1 >= 8 && p2 >= 8)return 1;
        else if(p1 >= 7.5 && p2 >= 7.5)return 0.5;
        return 0;
    }
    public int calSum(double p1, double p2, double bonus){
        double res = (int) Math.round((p1 + p2) / 2 + bonus);
        if(res >= 10)res = 10;
        return (int)res;
    }
    public String setRank(double sum){
        if(sum < 5)return "Truot";
        else if(sum < 7)return "Trung binh";
        else if(sum == 7)return "Kha";
        else if(sum == 8)return "Gioi";
        else return "Xuat sac";
    }
    public void setId(int id){
        this.Id = id;
    }
    @Override
    public String toString(){
        return "PH" + String.format("%02d", Id) + " " + name + " " + age + " " + sum + " " + rank;
    }
}
