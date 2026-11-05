import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String color = sc.next();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++){
            arr[i] = String.valueOf(color.charAt(i));
        }
        int cnt = 0;
        for (int i = 1; i < n; i++){
            if (arr[i-1].equals(arr[i])){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
