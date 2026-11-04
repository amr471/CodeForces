import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        int c = 0;
        String alf = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < s1.length(); i++){
            if (alf.indexOf(s1.charAt(i)) == alf.indexOf(s2.charAt(i))){
                c += 0;
            }else if
             (alf.indexOf(s1.charAt(i)) < alf.indexOf(s2.charAt(i))){
                c-= 1;
                break;
            }else{
                c += 1;
                break;
            }
        }
        System.out.println(c);
    }
}