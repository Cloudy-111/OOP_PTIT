
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- != 0){
            String n = sc.nextLine();
            String[] arr = n.split(" ");
            for(int i = 0; i < arr.length; ++i)
                if(!arr[i].isEmpty())System.out.print(rev(arr[i]) + " ");
            System.out.println();
        }
    }
    public static String rev(String n){
        StringBuilder sb = new StringBuilder();
        for(int i = n.length() - 1; i >= 0; --i)sb.append(n.charAt(i));
        return sb.toString();
    }
}
