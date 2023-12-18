public class Times {
    public static int idx = 1;
    private String name, id;
    private int amount, time;
    public Times(String name, String start, String end, int amount){
        this.id = String.format("T%02d", idx);
        this.name = name;
        String[] e = end.split(":");
        String[] s = start.split(":");
        this.time = Integer.parseInt(e[0]) * 60 + Integer.parseInt(e[1]) - Integer.parseInt(s[0]) * 60 - Integer.parseInt(s[1]);
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    @Override
    public String toString(){
        return String.format("%s %s %.2f", id, name, amount * 1.0 / (time * 1.0 / 60));
    }
}
