
public class Phanso {
    private long tuso, mauso;
    public Phanso(long tuso, long mauso){
        this.tuso = tuso;
        this.mauso = mauso;
    }
    public Phanso sum(Phanso b){
        long new_tuso = this.tuso * b.mauso + this.mauso * b.tuso;
        long new_mauso = this.mauso * b.mauso;
        return new Phanso(new_tuso, new_mauso);
    }
    public Phanso mul(Phanso b){
        long new_tuso = this.tuso * b.tuso;
        long new_mauso = this.mauso * b.mauso;
        return new Phanso(new_tuso, new_mauso);
    }
    public Phanso simplify(){
        long gcd = gcd(tuso, mauso);
        return new Phanso(tuso / gcd, mauso / gcd);
    }
    public long gcd(long a, long b){
        return b == 0 ? a : gcd(b, a % b);
    }
    @Override
    public String toString(){
        return String.format("%d/%d", tuso, mauso);
    }
}
