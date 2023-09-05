
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("D:\\My Computer\\Code\\Java\\NetBeans\\git\\OOP_PTIT\\J07001\\src\\DATA.in"));
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
            
        }
    }
    
}
