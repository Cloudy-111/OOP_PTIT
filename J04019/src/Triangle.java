public class Triangle {
    private Point a, b, c;
    public Triangle(Point a, Point b, Point c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public Boolean valid(){
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ac = a.distance(c);
        if(ab + bc <= ac || ab + ac <= bc || bc + ac <= ab)return false;
        return true;
    }
    public String getPerimeter(){
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ac = a.distance(c);
        double peri = ab + bc + ac;
        return String.format("%.3f", peri);
    }
}
