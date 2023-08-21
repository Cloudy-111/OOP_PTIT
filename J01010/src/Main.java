import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            String n = sc.next();
            System.out.println(cut(n));
        }
    }
    
    public static String cut(String s){
        StringBuilder sb = new StringBuilder("");
        for(char i : s.toCharArray()){
            switch(i){
                case('0'):
                    sb.append(i);
                    break;
                case('1'):
                    sb.append(i);
                    break;
                case('8'):
                    sb.append('0');
                    break;
                case('9'):
                    sb.append('0');
                    break;
                default:
                    return "INVALID";
            }
        }
        while(sb.charAt(0) == '0' && sb.length() > 1)sb.delete(0, 1);
        if(sb.charAt(0) == '0')return "INVALID";
        return sb.toString();
    }
    
}
