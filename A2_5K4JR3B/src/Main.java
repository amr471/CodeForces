import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        long[] res = new long[t];

        for (int i = 0; i < t; i++){
            int n = sc.nextInt();
            long[] z = new long[n];

            for (int j = 0; j < n; j++){
                int a = sc.nextInt();
                z[j] = (long) Math.pow(2, a);

            }
            Arrays.sort(z);
            for (int j = 0; j < n/2; j++){
                long x = z[j];
                z[j] = z[n-1-j];
                z[n-1-j] = x;

            }
            long s1 = 0;
            long s2 = 0;
            for (int j = 0; j < z.length; j++){
                if (s1 <= s2){
                    s1 += z[j];
                }else{
                    s2 += z[j];
                }
            }
            res[i] = s1*s2;
        }
        for (int i = 0; i < res.length; i++){
            long ans =  res[i];
            System.out.println(ans);
        }
    }
}