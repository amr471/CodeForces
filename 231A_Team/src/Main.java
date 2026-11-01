import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] res = new int[n][3];
        int c = 0;
        for (int i = 0; i < n; i++){


            for (int j = 0; j < 3; j++){
                res[i][j] = sc.nextInt();
            }
            int newc = 0;
            for (int j = 0; j < 3; j++){
                newc += res[i][j];

            }
            if (newc >=2){
                c++;
            }
        }
        System.out.println(c);


    }
}