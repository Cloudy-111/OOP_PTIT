
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Student a = new Student();
        a.setId("B20DCCN001");
        a.setname(sc.nextLine());
        a.setGrade(sc.nextLine());
        a.setBirthday(sc.nextLine());
        a.setP(sc.nextDouble());
        String birth = a.getBirthday();
        a.setBirthday(standard(birth));
        System.out.println(a);
    }
    public static String standard(String s){
        StringBuilder sb = new StringBuilder();
        String[] d = s.split("/");
        for(int i = 0; i < d.length; ++i){
            if(d[i].length() == 1){
                sb.append('0').append(d[i]);
            }
            else sb.append(d[i]);
            sb.append('/');
        }
        sb.delete(sb.length() - 1, sb.length());
        return sb.toString();
    }
}
