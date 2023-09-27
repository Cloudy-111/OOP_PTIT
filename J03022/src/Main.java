import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        //Scanner sc = new Scanner(new File("DATA.in"));
        String para = "";
        while(sc.hasNextLine()){
            String[] tmp = sc.nextLine().toLowerCase().split(" ");
            String sen = "";
            for(int i = 0; i < tmp.length; ++i)
                if(!tmp[i].isEmpty())sen += tmp[i] + " ";
            para += sen;
        }
        String[] sen = para.split("[.?!]");
        for(String i : sen){
            if(!i.equals(" ") && !i.isEmpty() && (i.matches(".*[a-zA-Z].*") || i.matches(".*\\d.*"))){
                i = i.trim();
                System.out.println(i.substring(0, 1).toUpperCase() + i.substring(1));
            }
        }
    }
    
}