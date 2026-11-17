import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        java.math.BigInteger n = sc.nextBigInteger();

        String n_string = n.toString();
        int[] n1 = new int[n_string.length()];

        int c = 0;
        for (int i =0; i < n1.length; i++){
            n1[i] = n_string.charAt(i);
        }
        for (int i = 0; i < n_string.length(); i++){
            if (n1[i] == '4' || n1[i] == '7'){
                c += 1;
            }
        }
        Integer c_int = c;
        String c_str = c_int.toString();
        int c1 = 0;
        for (int i = 0; i< c_str.length(); i++){

            if (c_str.charAt(i) == '4' || c_str.charAt(i) == '7'){
                c1 += 1;

            }else break;
        }
        if(c1 == c_str.length()){
            System.out.println("YES");
        }else System.out.println("NO");
    }
}
