import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][5];
        int res_i = 0;
        int res_j = 0;
        for (int i = 0; i < 5; i++){
            for (int j  = 0; j < 5; j++){
                int n = sc.nextInt();
                arr[i][j] = n;
            }
        }
        for (int i = 0; i < 5; i++){
            for (int j  = 0; j < 5; j++){
                if (arr[i][j] == 1){
                   res_i = i+1;
                   res_j = j+1;
                }

            }
        }
        int cnt = 0;
        if (res_i == 5 || res_i == 1){
            cnt += 2;
        } else if(res_i == 2 || res_i ==4){
            cnt += 1;
        }
        if (res_j == 5 || res_j == 1){
            cnt += 2;
        } else if(res_j == 2 || res_j ==4){
            cnt += 1;
        }
        System.out.println(cnt);

    }
}