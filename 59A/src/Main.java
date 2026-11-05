import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String alf_b = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        int cnt_b = 0;
        int cnt_m = 0;

        for (int i = 0; i < s.length(); i++){
            if(alf_b.indexOf(String.valueOf(s.charAt(i))) == -1){
                cnt_m++;
            }else cnt_b++;
        }
        if(cnt_m >= cnt_b){
            System.out.println(s.toLowerCase());
        }else System.out.println(s.toUpperCase());
    }
}