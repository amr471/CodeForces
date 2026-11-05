import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().replace("+", "");
        int[] interm = new int[str.length()];
        for (int i = 0; i < str.length(); i++){
            interm[i] = Integer.valueOf(str.charAt(i)) - '0';

        }

        Arrays.sort(interm);
        StringBuilder res = new StringBuilder();
        int indx = 0;
        for (int i = 0; i < str.length()*2-1; i++){
            if (i % 2 == 0){
                res.append(String.valueOf(interm[indx]));
                indx++;
            }else{
                res.append("+");
            }
        }
        System.out.println(res);

    }
}