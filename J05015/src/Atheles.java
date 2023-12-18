public class Atheles implements Comparable<Atheles>{
    private String id, name, address;
    private String end;
    private int aveSpeed;

    public Atheles(String name, String address, String end) {
        this.id = setId(name, address);
        this.name = name;
        this.address = address;
        this.end = end;
        this.aveSpeed = setSpeed(end);
    }
    public String setId(String name, String address){
        StringBuilder sb = new StringBuilder();
        for(String i : address.split(" ")){
            sb.append(i.charAt(0));
        }
        for(String i : name.split(" ")){
            sb.append(i.charAt(0));
        }
        return sb.toString();
    }
    public int setSpeed(String end){
        String[] tmp = end.split(":");
        int time = Integer.parseInt(tmp[0]) * 60 + Integer.parseInt(tmp[1]) - 6 * 60;
        return (int) Math.round(120 * 1.0  / (time * 1.0 / 60));
    }
    
    @Override
    public int compareTo(Atheles b){
        return this.end.compareTo(b.end);
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %s %d Km/h", id, name, address, aveSpeed);
    }
}
