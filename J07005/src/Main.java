
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        DataInputStream dt = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] f = new int[1001];
        for(int i = 1; i <= 100000; ++i)f[dt.readInt()]++;
        for(int i = 0; i <= 1000; ++i)if(f[i] > 0)System.out.println(i + " " + f[i]);
    }
    
}
