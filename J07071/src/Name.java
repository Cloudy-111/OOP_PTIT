public class Name implements Comparable<Name>{
    private String Comp, first, last, name;
    public Name(String name){
        this.name = name;
        String[] n = name.split(" ");
        this.last = n[n.length - 1];
        this.first = n[0];
        this.Comp = compact(n);
    }
    public static String compact(String[] s){
        StringBuilder sb = new StringBuilder("");
        for(int i = 0; i < s.length; ++i){
            sb.append(s[i].charAt(0)); 
            if(i != s.length - 1) sb.append(".");
        }
        return sb.toString();
    }
    public String getComp(){
        return this.Comp;
    }
    @Override
    public int compareTo(Name b){
        if(!b.last.equals(last))
            return last.compareTo(b.last);
        return first.compareTo(b.first);
    }
    @Override
    public String toString(){
        return name;
    }
}
