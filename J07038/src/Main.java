
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        Scanner sc = new Scanner(new File("SINHVIEN.in"));
        ArrayList<Student> lstStudent = new ArrayList<>();
        HashMap<String, Student> mapStu = new HashMap<>();
        int t1 = Integer.parseInt(sc.nextLine());
        while(t1-- != 0){
            Student a = new Student(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            mapStu.put(a.getId(), a);
            lstStudent.add(a);
        }
        sc.close();
        sc = new Scanner(new File("DN.in"));
        ArrayList<Company> lstCompany = new ArrayList<>();
        HashMap<String, Company> mapComp = new HashMap<>();
        int t2 = Integer.parseInt(sc.nextLine());
        while(t2-- != 0){
            Company a = new Company(sc.nextLine(), sc.nextLine(), Integer.parseInt(sc.nextLine()));
            mapComp.put(a.getId(), a);
            lstCompany.add(a);
        }
        sc.close();
        sc = new Scanner(new File("THUCTAP.in"));
        ArrayList<Thuctap> lstThuctap = new ArrayList<>();
        int t3 = Integer.parseInt(sc.nextLine());
        while(t3-- != 0){
            Thuctap a = new Thuctap(sc.next(), sc.next());
            lstThuctap.add(a);
        }
        int q = sc.nextInt();
        while(q-- != 0){
            String idCompany = sc.next();
            System.out.println("DANH SACH THUC TAP TAI " + mapComp.get(idCompany).getName() + ":");
            ArrayList<Student> pass = new ArrayList<>();
            for(Thuctap i : lstThuctap){
                if(i.getIdCompany().equals(idCompany)){
                    pass.add(mapStu.get(i.getIdStudent()));
                }
            }
            Collections.sort(pass);
            int nums = mapComp.get(idCompany).getNums();
            for(int i = 0; i < Math.min(nums, pass.size()); i++)
                System.out.println(pass.get(i));
        }
    }
    
}
