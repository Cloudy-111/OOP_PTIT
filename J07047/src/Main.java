
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException, FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("DATA.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Room> lstRoom = new ArrayList<>();
        while(n-- > 0){
            String[] inp = sc.nextLine().split(" ");
            char type = inp[0].charAt(0);
            Room a = new Room(inp[0], inp[1], Double.parseDouble(inp[2]), Double.parseDouble(inp[3]));
            lstRoom.add(a);
        }
        ArrayList<Customer> lst = new ArrayList<>();
        int p = Integer.parseInt(sc.nextLine());
        while(p-- > 0){
            String name = sc.nextLine();
            String idRoom = sc.nextLine();
            String dayIn = sc.nextLine();
            String dayOut = sc.nextLine();
            Room r = new Room();
            for(Room i : lstRoom)if(i.getType().equals(idRoom.substring(2,3))){
                r = i;
                break;
            }
            Customer a = new Customer(r, name, idRoom, dayIn, dayOut);
            lst.add(a);
        }
        lst.sort((a, b) -> {
            return b.getDays() > a.getDays() ? 1 : -1;
        });
        for(Customer i : lst){
            System.out.println(i);
        }
    }
    
}
