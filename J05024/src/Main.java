
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Student> lst = new ArrayList<>();
        while(t-- != 0){
            //sc.nextLine();
            Student a = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            lst.add(a);
        }
        int q = Integer.parseInt(sc.nextLine());
        while(q-- != 0){
            String major = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + major.toUpperCase() + ":");
            for(Student i : lst)if(CompMajor(major).equals(i.getMajor())){
                if((i.getMajor().equals("DCCN") || i.getMajor().equals("DCAT")) && !i.getMode().equals("E"))System.out.println(i);
                else if(!i.getMajor().equals("DCCN") && !i.getMajor().equals("DCAT")) System.out.println(i);
            }
        }
    }
    public static String CompMajor(String s){
        String res = "DC";
        String[] a = s.split(" ");
        for(int i = 0; i < 2; ++i)res += a[i].substring(0, 1).toUpperCase();
        return res;
    }
}
