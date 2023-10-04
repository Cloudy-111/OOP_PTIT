public class Product {
    private String id, name, Type;
    private int target;
    public Product(String id, String name, String Type){
        this.id = id;
        this.name = name;
        this.target = setTarget(Type);
    }
    public int setTarget(String type){
        if(type.equals("A"))return 8;
        else if(type.equals("B"))return 5;
        else return 2; 
    }
    public int getTarget(){
        return this.target;
    }
    public String getId(){
        return this.id;
    }
    @Override
    public String toString(){
        return id + " " + name;
    }
}
