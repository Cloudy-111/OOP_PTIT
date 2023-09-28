
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        ArrayList<Company> lst = new ArrayList<>();
        while(t-- != 0){
            Company a = new Company(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            lst.add(a);
        }
        Collections.sort(lst);
        int q = Integer.parseInt(sc.nextLine());
        while(q-- != 0){
            int a = sc.nextInt(), b = sc.nextInt();
            System.out.println(String.format("DANH SACH DOANH NGHIEP NHAN TU %d DEN %d SINH VIEN:", a, b));
            for(Company i : lst)if(i.getNum() >= a && i.getNum() <=b)System.out.println(i);
        }
    }
    
}
