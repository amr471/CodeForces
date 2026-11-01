import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        String[] arr= new String[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.next();

        }
        for (int i = 0; i < n; i++){
            if (arr[i].charAt(0) == '-' || arr[i].charAt(2) == '-'){
                c--;
            }else{
                c++;
            }
        }
        System.out.println(c);
    }
}