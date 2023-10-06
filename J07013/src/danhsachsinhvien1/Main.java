package danhsachsinhvien1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Main { 

    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        // TODO code application logic here
        ObjectInputStream os = new ObjectInputStream(new FileInputStream("SV.in"));
        ArrayList<SinhVien> lst = (ArrayList<SinhVien>)os.readObject();
        for(SinhVien i : lst){
            System.out.println(i);
        }
    }
}
