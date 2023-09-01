public class Complex {
    public long real, img;
    public Complex(long real, long img){
        this.real = real;
        this.img = img;
    }
    public Complex sum(Complex b){
        long new_real = this.real + b.real;
        long new_img = this.img + b.img;
        return new Complex(new_real, new_img);
    }
    public Complex mul(Complex b){
        long new_real = this.real * b.real - this.img * b.img;
        long new_img = this.real * b.img + this.img * b.real;
        return new Complex(new_real, new_img);
    }
    
    @Override
    public String toString(){
        if(img < 0)return String.format("%d - %di", real, Math.abs(img));
        return String.format("%d + %di", real, img);
    }
}
