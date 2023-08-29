public class Rectange {
    private double width, height;
    private String color;
    public Rectange(){
        this.width = 1.0;
        this.height = 1.0;
    }
    public Rectange(double width, double height, String color){
        this.color = color;
        this.width = width;
        this.height = height;
    }
    public double getWidth(){
        return this.width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double findArea(){
        return this.width * this.height;
    }
    public double findPerimeter(){
        return 2 * (this.width + this.height);
    }
}
