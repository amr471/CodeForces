import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String alf_b = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String alf_m = "abcdefghijklmnopqrstuvwxyz";

        StringBuilder res = new StringBuilder();

        String[] interm = new String[str.length()];

        if (alf_m.indexOf(str.charAt(0)) == -1){
            System.out.println(str);
        }else{
            res.append(alf_b.charAt(alf_m.indexOf(str.charAt(0))));
            for (int i = 1; i < str.length(); i++){
                res.append(str.charAt(i));
            }
        }


        System.out.println(res);
    }
}