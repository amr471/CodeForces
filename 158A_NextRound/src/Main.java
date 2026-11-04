import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            arr[i] = num;

        }
        int r = arr[k-1];
        int c = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] >= r && arr[i] > 0){
                c++;
            }
        }
        System.out.println(c);
    }
}