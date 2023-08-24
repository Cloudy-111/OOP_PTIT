
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            String n = sc.nextLine();
            String tmp = n.toLowerCase().trim();
            System.out.println(standard(tmp));
        }
    }
    public static String standard(String n){
        String[] arr = n.split(" ");
        StringBuilder res = new StringBuilder();
        for(int i = 0; i < arr.length; ++i)
            if(!arr[i].isEmpty()){
                String first = arr[i].substring(0,1).toUpperCase();
                String rest = arr[i].substring(1);
                res.append(first).append(rest).append(" ");
            }
        return res.toString().trim();
    }
}
