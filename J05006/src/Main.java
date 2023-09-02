
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Staff> lst = new ArrayList<>();
        for(int i = 1; i <= t; ++i){
            Staff a = new Staff(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            a.setId(i);
            a.setBirthday(standard(a.getBirthday()));
            a.setContracday(standard(a.getContractday()));
            lst.add(a);
        }
        for(Staff i : lst)System.out.println(i);
    }
    public static String standard(String s){
        String[] tmp = s.split("/");
        String res = "";
        for(int i = 0; i < tmp.length; ++i){
            if(tmp[i].length() == 1 )res += "0" + tmp[i];
            else res += tmp[i];
            if(i != tmp.length - 1)res += "/";
        }
        return res;
    }
}
