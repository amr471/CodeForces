import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k_cost = sc.nextInt();
        int n_balance = sc.nextInt();
        int w_amount = sc.nextInt();


        int end_cost = 0;

        for (int i = 1; i < w_amount+1; i++){
            end_cost += i*k_cost;

        }
        if (n_balance > end_cost){
            System.out.println(0);
        }else{
            int res = end_cost-n_balance;
            System.out.println(res);
        }

    }
}