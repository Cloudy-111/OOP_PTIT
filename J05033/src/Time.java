public class Time implements Comparable<Time>{
    private int hour, minute, second, time;
    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.time = hour * 3600 + minute * 60 + second;
    }
    public int getTime(){
        return hour * 3600 + minute * 60 + second;
    }
    @Override
    public int compareTo(Time t){
        return time - t.getTime();
    }
    @Override
    public String toString(){
        return hour + " " + minute + " " + second;
    }
}
