public class BTL {
    static int idx = 1;
    private String id, nameBTL;
    
    public BTL(String name){
        this.id = String.format("%d", idx);
        idx++;
        this.nameBTL = name;
    }
    
    public String getId(){
        return this.id;
    }
    
    public String getName(){
        return this.nameBTL;
    }
}
