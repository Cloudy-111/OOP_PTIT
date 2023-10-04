public class Student {
    private String id, name , grade, note;
    private String diary;
    private int attend;
    public Student(String id, String name, String grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    public void setNote(int attend){
        if(attend == 0)this.note = "KDDK";
        else this.note = "";
    }
    public void setAttend(String diary){
        int res = 10;
        int minus = 0;
        for(int i = 0; i < diary.length(); ++i){
            if(diary.charAt(i) == 'm')minus += 1;
            else if(diary.charAt(i) == 'v')minus += 2;
        }
        res -= minus;
        if(res < 0)this.attend = 0;
        else this.attend = res;
    }
    public void setDiary(String s){
        this.diary = s;
    }
    public String getId(){
        return this.id;
    }
    public int getAttend(){
        return this.attend;
    }
    @Override
    public String toString(){
        return String.format("%s %s %s %d %s", id, name, grade, attend, note);
    }
}
