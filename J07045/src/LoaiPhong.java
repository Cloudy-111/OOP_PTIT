public class LoaiPhong implements Comparable<LoaiPhong>{
    private String type, name, price, fee;
    public LoaiPhong(String info){
        String[] s = info.split(" ");
        this.type = s[0];
        this.name = s[1];
        this.price = s[2];
        this.fee = s[3];
    }
    public String getName(){
        return this.name;
    }
    @Override
    public int compareTo(LoaiPhong b){
        return this.name.compareTo(b.getName());
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %s", type, name, price, fee);
    }
}
