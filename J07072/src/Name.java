public class Name implements Comparable<Name>{
    private String name;
    private String last;
    public Name(String name){
        this.name = standard(name);
        String[] n = this.name.split(" ");
        this.last = n[n.length - 1];
    }
    public String standard(String s){
        String[] n = s.split(" ");
        StringBuilder res = new StringBuilder("");
        for(int i = 0; i < n.length; ++i){
            if(!n[i].isEmpty()){
                res.append(n[i].substring(0,1).toUpperCase()).append(n[i].substring(1).toLowerCase());
                if(i != n.length - 1)res.append(" ");
            }
        }
        return res.toString();
    }
    @Override
    public int compareTo(Name b){
        if(!this.last.equals(b.last))
            return this.last.compareTo(b.last);
        return this.name.compareTo(b.name);
    }
    @Override
    public String toString(){
        return name;
    }
}
