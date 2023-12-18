import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int pos = Math.max(a,b);
        int save[] = new int[pos + 1];

        for (int i = 1; i <= pos ; i++){
            save[i] = 1;
        }

        for (int i = 2; i * 2 <= pos; i++){
            for (int j = i * 2 ; j <= pos; j+= i ){
                save[j] += i ;
            }
        }

        int dem = 0;
        for (int i = Math.min(a,b); i <= pos;i++){
            if (save[i] > i) dem += 1;
        }
        System.out.println(dem);
    }
}
