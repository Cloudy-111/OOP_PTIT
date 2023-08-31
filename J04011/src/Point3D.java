public class Point3D {
    private int x,y,z;
    public Point3D(int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public Point3D(Point3D a, Point3D b){
        this.x = a.x - b.x;
        this.y = a.y - b.y;
        this.z = a.z - b.z;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getZ(){
        return this.z;
    }
    public static Boolean check(Point3D a, Point3D b, Point3D c, Point3D d){
        Point3D ab = new Point3D(a, b);
        Point3D ac = new Point3D(a, c);
        Point3D n_vector = new Point3D(ab.getY() * ac.getZ() - ac.getY() * ab.getZ(), ab.getZ() * ac.getX() - ac.getZ() * ab.getX(), ab.getX() * ac.getY() - ac.getX() * ab.getY());
        //System.out.println(n_vector);
        int free_num = n_vector.getX() * (- a.getX()) + n_vector.getY() * (- a.getY()) + n_vector.getZ() * (- a.getZ());
        if(n_vector.getX() * d.getX() + n_vector.getY() * d.getY() + n_vector.getZ() * d.getZ() + free_num == 0) return true;
        return false;
    }
}
