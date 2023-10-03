public class Candi {
    private int id, age, ave;
    private double theory, practice, bonus;
    private String name, rank;
    public Candi(String name, String birth, double theory, double practice){
        this.name = name;
        this.age = calAge(birth);
        this.bonus = calBonus(theory, practice);
        this.ave = calAve(theory, practice, this.bonus);
        this.rank = calRank(this.ave);
    }
    public int calAge(String birth){
        return 2021 - Integer.parseInt(birth.substring(6));
    }
    public double calBonus(double theory, double practice){
        if(theory >= 8.0 && practice >= 8.0)return 1.0;
        else if(theory >= 7.5 && practice >= 7.5)return 0.5;
        else return 0;
    }
    public int calAve(double theory, double practice, double bonus){
        int res = (int) Math.round((theory + practice) / 2 + bonus);
        if(res > 10)return 10;
        else return res;
    }
    public String calRank(int ave){
        if(ave < 5)return "Truot";
        else if(ave <= 6)return "Trung binh";
        else if(ave == 7)return "Kha";
        else if(ave == 8)return "Gioi";
        else return "Xuat sac";
    }
    public void setId(int id){
        this.id = id;
    }
    @Override
    public String toString(){
        return String.format("PH%02d %s %d %d %s", id, name, age, ave, rank);
    }
}
