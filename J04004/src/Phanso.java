public class Phanso {
    private long tuso, mauso;
    public Phanso(long tuso, long mauso){
        this.tuso = tuso;
        this.mauso = mauso;
    }
    public void setTuso(long tuso){
        this.tuso = tuso;
    }
    public void setMauso(long mauso){
        this.mauso = mauso;
    }
    public long getTuso(){
        return this.tuso;
    }
    public long getMauso(){
        return this.mauso;
    }
    public Phanso(Phanso a, Phanso b){
        this.tuso = a.getTuso() * b.getMauso() + a.getMauso() * b.getTuso();
        this.mauso = a.getMauso() * b.getMauso();
    }
    
    @Override
    public String toString(){
        return String.format("%d/%d", tuso, mauso);
    }
}
