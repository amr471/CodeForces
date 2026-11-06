import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int k = sc.nextInt();
        int n_int = Integer.parseInt(n);
        StringBuilder sb = new StringBuilder(n_int);

        while (k > 0) {

            int[] arr = new int[sb.length()];
            for (int i = 0; i < sb.length(); i++) {
                arr[i] = Integer.valueOf(n.charAt(i)) - '0';

            }

            if (arr[arr.length - 1] == 0) {

            }
        }
    }
}