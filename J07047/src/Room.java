public class Room {
    protected String type;
    protected String nameRoom;
    protected double price, fee;
    
    public Room(){
        
    }
    
    public Room(String type, String name, double price, double fee){
        this.type = type;
        this.nameRoom = name;
        this.price = price;
        this.fee = fee;
    }

    public String getType() {
        return type;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public double getPrice() {
        return price;
    }

    public double getFee() {
        return fee;
    }
    
    
}
